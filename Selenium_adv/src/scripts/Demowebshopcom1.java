package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demowebshopcom1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		d.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='Email']")).sendKeys("vilasini@gmail.com");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='Password']")).sendKeys("baekncv@123");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@class='sub-category-grid']/div[1]/div[1]/h2[1]/a")).click();
		Thread.sleep(1000);
		WebElement Sort_dd = d.findElement(By.xpath("//div[@class='product-selectors']/div[2]/select"));
		Select sel= new Select(Sort_dd);
		sel.selectByVisibleText("Name: Z to A");
		Thread.sleep(1000);
		WebElement display = d.findElement(By.xpath("//div[@class='product-page-size']/select"));
		Select sels=new Select(display);
		sels.selectByIndex(2);
		Thread.sleep(1000);
		WebElement view = d.findElement(By.xpath("//div[@class='product-viewmode']/select"));
		Select selss= new Select(view);
		selss.selectByVisibleText("List");
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@class='product-list']/div[1]/div[1]/div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(1000);
		d.findElement(By.linkText("Log out")).click();
		Thread.sleep(1000);
		d.quit();

	}

}
