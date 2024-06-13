package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class mavenParameterTest 
{
	@Test
	public void recievedata()
	{
		String URL= System.getProperty("url");
		System.out.println(URL);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
	}

}
