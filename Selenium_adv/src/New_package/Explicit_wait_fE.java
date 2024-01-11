package New_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_fE {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver d= new ChromeDriver(opt);
		d.get("https://www.facebook.com");
		WebDriverWait wait=new WebDriverWait(d, 10);
		//d.findElement(By.id("email")).sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN);
 		List<WebElement> links = d.findElements(By.xpath("//li//a"));
 		wait.until(ExpectedConditions.visibilityOfAllElements(links));
		for(WebElement link:links)
		{
			String text = link.getText();
			System.out.println(text);	
		}
		d.quit();
		
		
	}

}
