package scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Demowebshopdefect {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vilasini@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("baekncv@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a")).click();
		Thread.sleep(1000);
		WebElement add = driver.findElement(By.xpath("//div[@class='product-selectors']/div[2]/select"));
		Select sel1=new Select(add);
		sel1.selectByVisibleText("Name: A to Z");
		Thread.sleep(1000);
		WebElement add1 = driver.findElement(By.xpath("//div[@class='product-selectors']/div[3]/select"));
		Select sel2=new Select(add1);
		sel2.selectByVisibleText("12");
		Thread.sleep(1000);
		WebElement add3 = driver.findElement(By.xpath("//div[@class='product-selectors']/div[1]/select"));
		Select sel3=new Select(add3);
		sel3.selectByVisibleText("List");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='product-list']/div[1]/div[1]/div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(5000);
		WebElement w = driver.findElement(By.xpath("//div[@id='bar-notification']"));
		Thread.sleep(5000);
		if(w.isDisplayed())
		{ 
		 System.out.println("confirmation msg is displayed");
		 }
		else
		{
			System.out.println("invalid ");
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dst=new File("C:\\Users\\ACER\\Desktop\\Defect ss\\demodefect.jpg");
			FileHandler.copy(src, dst);
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		driver.quit();
		
	}

}
