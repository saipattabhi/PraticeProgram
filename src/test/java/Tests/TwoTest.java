package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.base;


public class TwoTest extends base {

	public WebDriver driver;
	@Test
public void TwoTest() throws IOException, Exception {
	
	System.out.println("ramayya has modified");
		
		System.out.println("inside two test");
		
		System.out.println("jan 19 is remarkable");
		
		
	driver=	IntializeDriver();
	
	driver.get("http://tutorialsninja.com/demo/");
	Thread.sleep(2000);
	driver.close();

	}
	
	@AfterMethod
public void closeBrowser()
{
	driver.close();
}
	
	
}
