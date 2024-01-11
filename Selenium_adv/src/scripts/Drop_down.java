package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("file:///C:/Users/ACER/Desktop/city.html");
		Thread.sleep(1000);
		WebElement drop_down = d.findElement(By.xpath("//select[@id='city-dropdown']"));
		Select sel =new Select(drop_down);
		sel.selectByIndex(0);
		Thread.sleep(1000);
		sel.selectByValue("B");
		Thread.sleep(1000);
		sel.selectByVisibleText("Amritsar");
		Thread.sleep(1000);
		sel.deselectByVisibleText("Amritsar");
		Thread.sleep(1000);
		d.quit();
		
		}

}
