package TestNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Instagrambaseclass {
@Test
public void login() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.get("https://www.instagram.com");
	d.findElement(By.xpath("//input[@name='username']")).sendKeys("bhumibhoo");
	d.findElement(By.xpath("//input[@name='password']")).sendKeys("manjumahesh", Keys.ENTER);
	String HOME = d.findElement(By.xpath("//span[text()='Home']")).getText();
	System.out.println(HOME);
	Assert.assertEquals(HOME,"Home");
	Thread.sleep(2000);
	WebElement A = d.findElement(By.xpath("//span[text()='Search']"));
	
	if(A.isEnabled())
	{
		A.click();
		d.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("upscworldofficial");
		d.findElement(By.xpath("//div[@role='dialog']/../../../following-sibling::div[1]/div[1]/a[1]/div[1]")).click();
		d.findElement(By.xpath("//div[text()='Follow']")).click();
	}
	
	d.quit();
}
	
	
}
