package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handleframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
				"./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(1000);
		WebElement frame_add = driver.findElement(By.xpath("//iframe[@title='Login Form']"));
		driver.switchTo().frame(frame_add);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("email@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.close();
	}

}
