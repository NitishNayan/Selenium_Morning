package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FerariTest
{
	@Test(groups ="smoke")
	public void launch()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ferrari.com/en-IN");
		Reporter.log("Ferari launched successfully",true);
	}
	

}
