package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElements1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		d.manage().window().maximize();
		Thread.sleep(1000);
		d.findElement(By.xpath("//li[text()='Disabled']")).click();
		WebElement name = d.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].value='bhumika'", name);
		Thread.sleep(2000);
		WebElement email = d.findElement(By.xpath("//input[@id='email']"));
		js.executeScript("arguments[0].value='bhumikalt98@gmail.com'", email);
		Thread.sleep(2000);
		WebElement pwd = d.findElement(By.xpath("//input[@id='password']"));
		js.executeScript("arguments[0].value='bhumika@123'", pwd);
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='Register']")).click();
		Thread.sleep(2000);
		d.quit();
		
		
		

	}

}
