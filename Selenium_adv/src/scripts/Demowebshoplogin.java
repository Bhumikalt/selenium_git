package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshoplogin {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("Smartphone");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Smartphone")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Add your review']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='review-title']")).sendKeys("bad product");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='review-text']")).sendKeys("Product not meets standards");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Submit review']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
		
		
		
		
	}

}
