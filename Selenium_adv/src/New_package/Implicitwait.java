package New_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Implicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/progress/element?sublist=2");
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("10");
		d.findElement(By.xpath("//button[text()='Start']")).click();
		WebElement W=d.findElement(By.xpath("//p[text()='Do you like Automation']"));
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("arguments[0].scrollIntoView();",W);
		WebElement E=d.findElement(By.xpath("//select"));
		Select sel=new Select(E);
		sel.selectByVisibleText("Yes");
			
		
		
	}

}
