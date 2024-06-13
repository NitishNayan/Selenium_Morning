package extentreports;

import java.time.LocalDateTime;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports {

	@Test
	public void report() {

		String TIME = LocalDateTime.now().toString().replace(":", "-");

		// Step 1 : create ExtentSparkReporter object
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTLM_reports/extentReport" + TIME + ".html");

		// Step 2 : create ExtentReporter object
		ExtentReports extReport = new ExtentReports();

		// Step 3 : attach spark report to ExtentReports
		extReport.attachReporter(spark);

		// Step 4 : create ExtentTest object
		ExtentTest test = extReport.createTest("report");

		// Step 5 : call log method to provide the status and message
		test.log(Status.PASS, "log message added to extent reports");

		// Step 6 : call flush() to write report into destination
		extReport.flush();

	}

}
