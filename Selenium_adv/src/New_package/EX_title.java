package New_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EX_title {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver d= new ChromeDriver(opt);
		d.get("https://www.facebook.com");
		WebDriverWait wait=new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.titleContains("Facebook"));
		d.findElement(By.id("email")).sendKeys("haiii");
		d.quit();
	}

}
