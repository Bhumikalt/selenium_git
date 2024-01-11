package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class partialnkan {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ACER/Desktop/links.html");
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("goo")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("ಕನ್ನಡ")).click();
		Thread.sleep(2000);
		driver.quit();


	}

}
