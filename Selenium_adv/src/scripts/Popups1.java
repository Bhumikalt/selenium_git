package scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		Thread.sleep(12000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement swg = driver.findElement(By.xpath("//a[text()='Swagger documentation']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", swg);
		Thread.sleep(2000);
		swg.click();
		Alert A1 = driver.switchTo().alert();
		A1.accept();
		Thread.sleep(3000);
		A1.sendKeys("admin");
		Thread.sleep(3000);
		A1.accept();
		Thread.sleep(3000);
		A1.sendKeys("");
		A1.accept();
		Thread.sleep(1000);
		driver.quit();


	}

}
