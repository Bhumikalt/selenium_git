package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Aseert {
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(1000);
		String title = d.getTitle();
		Assert.assertEquals(title, "OrangeHRMrttyu");
		Thread.sleep(2000);
		d.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		d.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		d.quit();
	}

}
