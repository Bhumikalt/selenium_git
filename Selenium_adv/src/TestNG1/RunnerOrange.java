package TestNG1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerOrange extends BaseclassOrange{
	@Test
	public void Admin()
	{
		d.findElement(By.xpath("//span[text()='Admin']")).click();
		d.findElement(By.xpath("//div[contains(@class,'orangehrm-header-container') ]/button")).click();
		d.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[1]")).click();
		d.findElement(By.xpath("(//div[@role='option])[1]")).click();
		
		
	}
}
