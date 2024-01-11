package pom_class_fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_cls {
	@FindBy(id="email")
	private WebElement un_txt;
	public Pom_cls(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void enter_un()
	{
		un_txt.sendKeys("hi");
	}

}
