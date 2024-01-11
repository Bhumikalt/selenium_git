package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshopcom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		d.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='Email']")).sendKeys("vilasini@gmail.com");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='Password']")).sendKeys("baekncv@123");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@class='sub-category-grid']/div[1]/div[1]/h2[1]/a")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@class='product-selectors']/div[2]/select")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//option[text()='Name: Z to A']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@class='product-page-size']/select")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@class='product-page-size']/select/option[3]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@class='product-viewmode']/select")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@class='product-viewmode']/select/option[2]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@class='product-list']/div[1]/div[1]/div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(1000);
		d.findElement(By.linkText("Log out")).click();
		Thread.sleep(1000);
		d.quit();
		
	}

}
