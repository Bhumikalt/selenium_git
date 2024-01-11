package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demowebshop1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vilasini@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("baekncv@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../following-sibling::div[3]/div[2]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Fiction']/../following-sibling::div[3]/div[2]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='header-links']/ul/li[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@class='cart']/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@class='cart']/tbody/tr[2]/td[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
