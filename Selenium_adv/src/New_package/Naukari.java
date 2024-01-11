package New_package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.get("https://www.naukri.com/");
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("\"C:\\Users\\ACER\\Desktop\\Au3\\naukari1.exe\"");
		Thread.sleep(1000);
		d.quit();
		
	}

}
