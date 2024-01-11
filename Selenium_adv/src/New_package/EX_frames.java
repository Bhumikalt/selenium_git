package New_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EX_frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver d= new ChromeDriver(opt);
		Thread.sleep(2000);
		d.get("https://demoapps.qspiders.com");
		Thread.sleep(1000);
		d.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[text()='Nested with Multiple iframe']")).click();
		Thread.sleep(2000);
		WebElement A = d.findElement(By.xpath("//iframe[@title='Parent Nested iframe']"));
		d.switchTo().frame(A);
		Thread.sleep(1000);
		
		
		
		
	}

}
