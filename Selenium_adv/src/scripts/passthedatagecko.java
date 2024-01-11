package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class passthedatagecko {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ACER/Desktop/Trextfield.html");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("hello");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("world");
		Thread.sleep(1000);
		driver.quit();

	}

}
