package scripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.myntra.com/");
		Thread.sleep(1000);
		d.manage().window().maximize();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]")).sendKeys("shoes for men",Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.xpath("//ul[@class='results-base']/li[3]")).click();
		Thread.sleep(8000);
		Set<String> id = d.getWindowHandles();
		ArrayList<String> A= new ArrayList<String>(id);
		String S = A.get(1);
		d.switchTo().window(S);
		Thread.sleep(3000);
		d.findElement(By.xpath("(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[3]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite pdp-whiteBag ')]/..")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite desktop-iconBag ')]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='MOVE TO WISHLIST']")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		d.quit();
	}
}
