package genaric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class basic_hybrid_framework implements stds{
	public WebDriver d;
	@BeforeMethod
	public void launch()
	{
		System.setProperty(key,value);
		d= new ChromeDriver();
		d.get(base_url);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	}
	
	@AfterMethod
	public void closeapp()
	{
		d.quit();
	}

}
