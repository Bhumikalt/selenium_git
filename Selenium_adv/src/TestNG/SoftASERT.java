package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftASERT {
	@Test
	public void softasrnt() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.facebook.com");
		Thread.sleep(1000);
		String Fsize = d.findElement(By.xpath("//h2[contains(text(),'Facebook helps you ')]")).getCssValue("font_size");
		System.out.println(Fsize);
		SoftAssert ast= new SoftAssert();
		ast.assertEquals(Fsize, "hi");
		d.findElement(By.id("email")).sendKeys("jayashree");
		ast.assertAll();
		d.quit();
	}

}
