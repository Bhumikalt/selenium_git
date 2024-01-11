package pom_class_fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runner {
	@Test
	public void run() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		Pom_cls p =new Pom_cls(d);
		Thread.sleep(1000);
		p.enter_un();
		d.navigate().refresh();
		Thread.sleep(2000);
		p.enter_un();
		
	}
	

}
