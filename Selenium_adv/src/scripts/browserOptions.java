package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browserOptions {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("start-maximized","incognito");
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d = new ChromeDriver(opt);
		Thread.sleep(3000);
		d.get("https://www.redbus.in");
		

	}

}
