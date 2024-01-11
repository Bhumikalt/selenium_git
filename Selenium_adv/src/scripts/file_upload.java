package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ACER/Desktop/popup.html");
		Thread.sleep(1000);
		driver.findElement(By.id("upload")).sendKeys("C:\\Users\\ACER\\Desktop\\class diag.pptx");
		Thread.sleep(1000);
		driver.quit();


	}

}
