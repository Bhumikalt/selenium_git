package TestNG1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner extends Baseclass{
	@Test
	public void login() throws InterruptedException
	{
		d.findElement(By.id("email")).sendKeys("Bhumika");
		Thread.sleep(1000);
		d.findElement(By.id("pass")).sendKeys("Bhumika@123");
		Thread.sleep(1000);
	}

}
