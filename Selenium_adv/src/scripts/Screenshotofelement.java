package scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotofelement {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in");
		Thread.sleep(1000);
		d.manage().window().maximize();	
		WebElement t = d.findElement(By.id("twotabsearchtextbox"));
		File src = t.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\ACER\\Desktop\\Defect ss\\element defect.png");
		FileHandler.copy(src, dst);
		Thread.sleep(1000);
		d.quit();
	}

}
