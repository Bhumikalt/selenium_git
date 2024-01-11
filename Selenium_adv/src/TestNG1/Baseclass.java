package TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	public WebDriver d;
@BeforeMethod
public void openapp()
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	d= new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com");
}
@AfterMethod
public void closeapp()
{
	d.quit();
}
}
