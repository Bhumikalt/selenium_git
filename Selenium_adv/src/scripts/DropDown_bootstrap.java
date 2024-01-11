package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_bootstrap {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.shaadi.com/");
		Thread.sleep(1000);
		d.manage().window().maximize();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[contains(@class,'PreferenceForm_formWrappe')]/form/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[text()='Man']")).click();
		Thread.sleep(1000);
		d.quit();
	}

}
