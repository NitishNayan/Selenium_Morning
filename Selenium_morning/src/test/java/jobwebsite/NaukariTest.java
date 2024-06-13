package jobwebsite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NaukariTest 
{
	@Test
	public void launch()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=Cj0KCQjw6auyBhDzARIsALIo6v8dgRys3UTz7pXuXnbcaA7gHYVQIPdapuyjarGXgu85FylJqYG3JgsaAuvZEALw_wcB&gclsrc=aw.ds");
		Reporter.log("Naukari website launced successfully",true);
		
	}
	

}
