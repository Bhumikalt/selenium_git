package scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchredbus {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.redbus.com");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("\"C:\\Users\\ACER\\Desktop\\Au3\\redbusss.exe\"");
		Thread.sleep(2000);
		driver.quit();
	}

}
