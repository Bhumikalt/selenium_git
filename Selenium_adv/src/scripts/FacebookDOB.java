package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDOB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com");
		Thread.sleep(2000);
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		d.findElement(By.name("birthday_day")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//option[@value='28']")).click();
		Thread.sleep(1000);
		d.findElement(By.name("birthday_month")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//option[text()='Oct']")).click();
		Thread.sleep(1000);
		d.findElement(By.name("birthday_year")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//option[text()='1998']")).click();
		Thread.sleep(3000);
		d.quit();
	}

}
