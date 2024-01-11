package Property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_class {
	@FindBy(id="email")
	private WebElement un_txt;
	@FindBy(id="pass")
	private WebElement pwd_txt;
	@FindBy(name="Login")
	private WebElement lgn_btn;
	 
	public pom_class(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	public WebElement usn()
	{
		return un_txt;
	}
	public WebElement pwd()
	{
		return pwd_txt;
	}
	public WebElement login()
	{
		return lgn_btn;
	}
	

}
