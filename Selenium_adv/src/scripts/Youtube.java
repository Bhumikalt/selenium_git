package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='search']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("bewajah nahi milna tera mera song");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
        Thread.sleep(50000);
        driver.quit();
      
    }

}
