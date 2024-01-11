package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload_Autoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ACER/Desktop/popup.html");
		Thread.sleep(1000);
		Runtime.getRuntime().exec("\"C:\\Users\\ACER\\Desktop\\Au3\\classAutoit.exe\"");
		Thread.sleep(3000);
		driver.quit();

	}

}
