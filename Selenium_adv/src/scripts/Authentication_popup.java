package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://admin:admin@the-internet.herokuapp.com/");
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		Thread.sleep(1000);
		d.quit();
	}

}
