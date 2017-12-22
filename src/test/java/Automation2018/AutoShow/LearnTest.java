package Automation2018.AutoShow;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Automation2018.AutoShow.Pages.LoginPage;
import ExtentReports.ExtentTestManager;

public class LearnTest extends BaseTest
	{
	
	    
		@Test
		public void test1() throws InterruptedException
		{
			ExtentTestManager.getTest().setDescription("Invalid Login Scenario with username and password.LeanTest");
	    	
	    		LoginPage lp = new LoginPage(driver);
				lp.setUserName("abhishek.choudharry@gmail.com");
				lp.setPassword("abc2017#");
				lp.ClickLogin();
				Assert.assertEquals(lp.VerifyLogin(), true, "Page not visbile");;
				
	    	
		}
		
		
	}

	


