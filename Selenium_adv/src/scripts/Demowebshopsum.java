package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demowebshopsum {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vilasini@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("baekncv@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../following-sibling::div[3]/div[2]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Fiction']/../following-sibling::div[3]/div[2]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='header-links']/ul/li[3]")).click();
		Thread.sleep(1000);
		WebElement N=driver.findElement(By.xpath("//table[@class='cart']/tbody/tr[1]/td[6]/span[2]"));
		String A=N.getText();
		System.out.println(A);
		double S=Double.parseDouble(A);
		Thread.sleep(1000);
		WebElement M=driver.findElement(By.xpath("//table[@class='cart']/tbody/tr[2]/td[6]/span[2]"));
		String B=M.getText();
		System.out.println(B);
		double s=Double.parseDouble(B);
		Thread.sleep(1000);
		WebElement V=driver.findElement(By.xpath("//div[@class='cart-footer']/div[2]//tbody/tr[1]/td[2]/span"));
		String W=V.getText();
		System.out.println(W);
		double f=Double.parseDouble(W);
		double D= S+s;
		System.out.println(D);
		if(f==D)
		{
			System.out.println("proper price");
		}
		else
		{
			System.out.println("not proper price");
		}
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
