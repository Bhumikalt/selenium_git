package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Property.pom_class;
import genaric.basic_hybrid_framework;

public class Runner_class extends basic_hybrid_framework{
	@Test
	public void run(WebDriver d)
	{
		pom_class p = new pom_class(d);
		p.usn().sendKeys("bhumika");
		p.pwd().sendKeys("password@123");
		p.login().click();
		
	}

}
