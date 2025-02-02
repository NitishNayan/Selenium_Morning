package extentreports;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AttachScreenShot {
	@Test
	public void screenshot() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		driver.get("https://demowebshop.tricentis.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);

		ExtentSparkReporter spark = new ExtentSparkReporter("./HTLM_reports/screenshotReport.html");
		ExtentReports extReport = new ExtentReports();
		extReport.attachReporter(spark);
		ExtentTest test = extReport.createTest("report");

		test.log(Status.INFO, "added screenshot in reports");
		test.addScreenCaptureFromBase64String(screenshot,"error image");

		extReport.flush();

	}

}
