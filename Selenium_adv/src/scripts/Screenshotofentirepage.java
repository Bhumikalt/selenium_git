package scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotofentirepage {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in");
		Thread.sleep(1000);
		d.manage().window().maximize();	
		TakesScreenshot ts=(TakesScreenshot)d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\ACER\\Desktop\\Defect ss\\amazon defect.jpg");
		FileHandler.copy(src, dst);
		Thread.sleep(1000);
		d.quit();
		
	}

}
