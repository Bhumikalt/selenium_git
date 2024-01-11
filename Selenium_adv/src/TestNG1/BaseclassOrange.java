package TestNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseclassOrange {
	public WebDriver d;
	@BeforeClass
	public void Launch()
	{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	  d=new ChromeDriver();
	  d.manage().window().maximize();
	  d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@BeforeMethod
	public void login()
	{
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
//	@AfterMethod
//	public void logout()
//	{
//		
//	}

}
