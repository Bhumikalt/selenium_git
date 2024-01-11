package reports;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import scripts.file_upload;

public class gen_report {
	@Test
	public void run() throws IOException
	{
		ExtentSparkReporter report =new ExtentSparkReporter("./reporter/extent_report.html");
		ExtentReports rep = new ExtentReports();
		rep.attachReporter(report);
		ExtentTest test = rep.createTest("testcase for extent report").assignAuthor("Bhumika");
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.log(Status.INFO, "browser is launched");
		d.get("https://www.zomato.com");
		test.log(Status.INFO, "the url is launched");
		String title = d.getTitle();
		if(title.equals("Zomato"))
		{
			test.log(Status.PASS, "testcase is pass");
		}
		else
		{
			test.log(Status.FAIL, "testcase is failed");
			test.addScreenCaptureFromPath(getphoto(d));
		}
		rep.flush();	
	}

public String getphoto(WebDriver d) throws IOException
{
	String path ="./photos/defect.jpg";
	TakesScreenshot tss = (TakesScreenshot) d;
	File src = tss.getScreenshotAs(OutputType.FILE);
	File dst = new File(path);
	org.openqa.selenium.io.FileHandler.copy(src, dst);
	return "."+path;
	
	
	
}		
}
