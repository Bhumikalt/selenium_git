package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdob1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com");
		Thread.sleep(2000);
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement BD = d.findElement(By.name("birthday_day"));
		Select sel= new Select(BD);
		sel.selectByValue("28");
		Thread.sleep(1000);
		WebElement BM = d.findElement(By.name("birthday_month"));
		Select sel1= new Select(BM);
		sel1.selectByVisibleText("Oct");
		Thread.sleep(1000);
		WebElement BY = d.findElement(By.name("birthday_year"));
		Select sel2= new Select(BY);
		sel2.selectByVisibleText("1998");
		Thread.sleep(3000);
		d.quit();
	

	}

	}


