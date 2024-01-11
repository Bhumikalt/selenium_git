package Property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fetch_data {
	@Test
	public void testdata() throws IOException
	{
		FileInputStream fis = new FileInputStream("./Property_file/data.properties");
		Properties P =new Properties();
		P.load(fis);
		String user = P.getProperty("un");
		String psd = P.getProperty("pwd");
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.findElement(By.name("username")).sendKeys(user);
		d.findElement(By.name("password")).sendKeys(psd);
		d.quit();
		
	}

}
