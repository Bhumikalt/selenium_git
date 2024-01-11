package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newdemowebshop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vilasini@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("baekncv@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Smartphone");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit' or @value='Search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Smartphone")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/productreviews/43' and text()='Add your review']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='review-title']")).sendKeys("product quality is not good");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='review-text']")).sendKeys("product doesn't meet standards");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='radio' and @value='3']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Submit review']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(3000);
		driver.quit();		
	}

}
