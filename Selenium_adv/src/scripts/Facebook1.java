package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com");
		Thread.sleep(2000);
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(1000);
		WebElement p = d.findElement(By.xpath("//input[@name='sex' and @value='1']"));
		Thread.sleep(1000);
		p.click();
		Thread.sleep(1000);
		if(p.isSelected())
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
		Thread.sleep(1000);
		d.quit();
	}

}
