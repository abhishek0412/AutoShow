package Automation2018.AutoShow;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BaseTest {
  
	//public WebDriver driver ;
	public AutoUtil autoutil  = new AutoUtil("chrome");
	public WebDriver driver = autoutil.getDriver();
	
	public WebDriver getDriver() 
	{
		driver = autoutil.getDriver();
        return autoutil.getDriver();
    }
	
  @BeforeTest
  public void beforeTest() {	
	
	//driver = autoutil.getDriver();
	autoutil.launchBrowser("http://newtours.demoaut.com/mercurywelcome.php");
  }

  @AfterTest
  public void afterTest() {
	  autoutil.CloseBrowser();
  }

}
