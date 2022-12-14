package practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PropertyFile 
{

	public static void main(String[] args) throws Throwable
	{
		Properties p = new Properties();
		p.load(new FileInputStream("C:\\Seleniumwork\\Demo\\OR.properties"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("Url"));
		WebDriverWait mywait = new WebDriverWait(driver,10);
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath(p.getProperty("ObjReset"))));
		driver.findElement(By.xpath(p.getProperty("ObjReset"))).click();
		driver.findElement(By.xpath(p.getProperty("ObjUser"))).sendKeys(p.getProperty("usernamedata"));
		driver.findElement(By.xpath(p.getProperty("ObjPass"))).sendKeys(p.getProperty("passworddata"));
		driver.findElement(By.xpath(p.getProperty("ObjLogin"))).click();
		driver.quit();
		
			
		
	}

}
