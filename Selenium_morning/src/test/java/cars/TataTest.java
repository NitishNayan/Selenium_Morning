package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TataTest
{
	@Test(groups ="smoke")
	public void launch()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.tatamotors.com/");
		Reporter.log(" tata launched successfully",true);
	}
	

}
