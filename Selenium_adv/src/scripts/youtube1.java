package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube1 
{
  public static void main(String[] args) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.youtube.com");
	Thread.sleep(4000);
/*	d.findElement(By.xpath("//input[@id='search']")).sendKeys("ghost bgm");
	Thread.sleep(3000);
	d.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='search']")).clear();
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='search']")).sendKeys("T series");
	Thread.sleep(3000);
	d.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(1000);
	d.findElement(By.xpath("//input[@id='search']")).clear();
	Thread.sleep(2000);
	//d.findElement(By.xpath("//input[@id='search']")).sendKeys("KGF trailer");
	//Thread.sleep(3000);
	//d.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(1000);*/
	d.findElement(By.xpath("//div[@id='start']")).click();
	Thread.sleep(3000);
	
	
}
}
