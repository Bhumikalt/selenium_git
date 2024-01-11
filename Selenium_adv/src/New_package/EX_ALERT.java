package New_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EX_ALERT {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver d= new ChromeDriver(opt);
		d.get("https://demo.guru99.com/test/delete_customer.php");
		WebDriverWait wait=new WebDriverWait(d, 10);
		d.findElement(By.name("cusid")).sendKeys("1234",Keys.ENTER);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	}

}
