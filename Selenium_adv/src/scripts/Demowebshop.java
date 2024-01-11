package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Naidile");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("S Bellum");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text' and @name='Email']")).sendKeys("vilasini@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("baekncv@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("baekncv@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		Thread.sleep(3000);
		driver.quit();
}
}
