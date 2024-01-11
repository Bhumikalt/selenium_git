package New_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		WebDriverWait wait =new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.urlContains("facebook"));
		d.findElement(By.id("email")).sendKeys("bhumika");
		d.findElement(By.id("pass")).sendKeys("password");
		d.quit();	
	}

}
