package TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RunnerclassInsta extends BaseclassofInsta{
	@Test
	public void Following() throws InterruptedException
	{
		String HOME = d.findElement(By.xpath("//span[text()='Home']")).getText();
		System.out.println(HOME);
		Assert.assertEquals(HOME,"Home");
		Thread.sleep(2000);
		WebElement A = d.findElement(By.xpath("//span[text()='Search']"));
		if(A.isEnabled())
		{
			A.click();
			d.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("upscworldofficial");
			d.findElement(By.xpath("//div[@role='dialog']/../../../following-sibling::div[1]/div[1]/a[1]/div[1]")).click();
			d.findElement(By.xpath("//div[text()='Follow']")).click();
		}
	}

}
