package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.flipkart.com");
		Thread.sleep(4000);
		d.manage().window().maximize();
		Thread.sleep(1000);
		d.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[contains(@placeholder,'Search for Products')]")).sendKeys("Samsung s21 fe");
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S21 FE 5G (Graphite, 128 GB)']/../following-sibling::div/div[1]/div[1]/div[1]")).click();
		Thread.sleep(8000);
		WebElement A=d.findElement(By.xpath("//span[contains(text(),'SAMSUNG Galaxy S21 FE 5G (Graphite, 128 GB)')]/../../following-sibling::div[3]/div[1]/div[1]/div[1]"));
		Thread.sleep(5000);
		String text=A.getText();
		if(text.equals("₹39,999"))
		{
			System.out.println("matching");
		}
		else
		{
			System.out.println("not matching");
		}
		d.quit();
		
	}

}
