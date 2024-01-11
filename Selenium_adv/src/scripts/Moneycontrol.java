package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moneycontrol {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text()='Most Active']/../../../div[2]/div[2]/table/tbody/tr[1]/td[1]/a")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
