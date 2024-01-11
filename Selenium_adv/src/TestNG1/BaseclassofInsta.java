package TestNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseclassofInsta 
{
	public WebDriver d;
	@BeforeClass
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.instagram.com");
	}
	
	@BeforeClass
	public void login()
	{
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("bhumibhoo");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("manjumahesh", Keys.ENTER);
	}
	@AfterMethod
	public void logout()
	{		d.findElement(By.xpath("(//*[local-name()='svg'])[11]")).click();
		d.findElement(By.xpath("//span[text()='Log out']")).click();
		
	}
	
	@AfterClass
	public void closeapp()
	{
		d.quit();
	}

}
