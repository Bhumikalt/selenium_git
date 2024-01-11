package New_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.interactions.Actions;

public class Robot_class {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement d = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Point P = d.getLocation();
		int X=P.getX();
		int Y=P.getY();
		js.executeScript("window.scrollBy("+X+","+Y+")");
		Actions act=new Actions(driver);
	    act.contextClick(d).perform();
	    Thread.sleep(5000);
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(5000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		Set<String> BHU = driver.getWindowHandles();
		ArrayList<String> A=new ArrayList<String>(BHU);
		String tab1=A.get(1);
		driver.switchTo().window(tab1);
		WebElement S = driver.findElement(By.xpath("//a[text()='ಹೊಸ ಖಾತೆಯನ್ನು ರಚಿಸಿ']"));
		S.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
