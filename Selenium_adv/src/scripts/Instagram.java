package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.instagram.com/");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("bhumibhoo");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("manjumahesh");
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[contains(@aria-label,'Direct messaging')]/div/div[1]/div[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//div[@role='listitem'])[1]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@aria-describedby='Message']")).sendKeys("Happy Deepawali ");
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//*[local-name()='svg'])[10]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[@href='/accounts/edit/']/following-sibling::div[8]")).click();
		Thread.sleep(3000);
		
		/*d.findElement(By.xpath("(//div[@data-visualcompletion='ignore'])[1]/../following-sibling::div[3]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@role='button']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[contains(text(),'Log Out'])")).click();*/
		Thread.sleep(3000);
		d.quit();
		}
}
