package New_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handle_jdbc {
	@Test
	public void getdata() throws SQLException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		Thread.sleep(2000);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		Statement crn = con.createStatement();
		ResultSet res = crn.executeQuery("select * from data");
		String un;
		String pwd;
		while(res.next())
		{
			 un = res.getString(1);
			pwd = res.getString(2);
			System.out.println(un+" "+pwd);
			d.findElement(By.id("username")).sendKeys(un);
			d.findElement(By.id("password")).sendKeys(pwd,Keys.ENTER);
		}
		
		d.quit();
		
	}
}
