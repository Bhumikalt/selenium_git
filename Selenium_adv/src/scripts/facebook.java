package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ACER/Desktop/links.html");
		Thread.sleep(1000);
		driver.findElement(By.linkText("facebook")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("bhoo@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("bhoo");
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(5000);
		driver.quit();


	}

}
