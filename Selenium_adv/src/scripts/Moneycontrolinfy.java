package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moneycontrolinfy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		driver.manage().window().maximize();
		Thread.sleep(100000);
		WebElement A = driver.findElement(By.xpath("(//input[@name='search_str' and @id='search_str' ])[1]"));
		A.click();
		Thread.sleep(100000);
		A.sendKeys("Infy",Keys.ENTER);
		WebElement B = driver.findElement(By.xpath("//div[@class='tab-pane fade active']/div/div[1]/div[1]/div[1]/div[2]"));
		String text=B.getAttribute("rel");
		System.out.println(text);
		Thread.sleep(10000);
		driver.quit();
	}

}
