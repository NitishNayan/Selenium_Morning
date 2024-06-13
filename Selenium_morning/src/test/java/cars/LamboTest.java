package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LamboTest 
{
	@Test(groups ="system")
	public void launch()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.lamborghini.com/en-en");
		Reporter.log(" lamborgini launched successfully",true);
	}
	

}
