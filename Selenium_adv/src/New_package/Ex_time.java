package New_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex_time {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/progress/element?sublist=2");
		WebDriverWait wait=new WebDriverWait(d, 15);
		wait.until(ExpectedConditions.urlContains("https://demoapps.qspiders.com/progress/element?sublist=2"));
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
