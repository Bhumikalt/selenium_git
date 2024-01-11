package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class facebook {
	@Test
	public void login_script()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		Reporter.log("browser launched", true);
		d.manage().window().maximize();
		Reporter.log("browser maximised", true);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.facebook.com");
		Reporter.log("facebook launced", true);
		d.findElement(By.id("email")).sendKeys("bhumika");
		Reporter.log("email entered", true);
		d.findElement(By.id("pass")).sendKeys("password@123");
		Reporter.log("password entered", true);
		d.quit();
		Reporter.log("browser closed", true);
	}

}
