package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FordTest 
{
	@Test(groups ="system")
	public void launch()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ford.com/");
		Reporter.log(" ford launched successfully",true);
		
	}
	

}
