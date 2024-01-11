package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramverifying {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Bhoomika");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("bhoo@28");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		

	}

}
