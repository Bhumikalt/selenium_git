package Property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class anime {
	@Test
	public void run() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://aniwatch.to/");
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[text()='Movies']")).click();
		Thread.sleep(3000);
		d.quit();
	}

}
