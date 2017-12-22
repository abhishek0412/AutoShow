package Automation2018.AutoShow;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Automation2018.AutoShow.Pages.LoginPage;
import ExtentReports.ExtentTestManager;

public class AppTest extends BaseTest
	{	  
		
		@Test
		public void test2() throws InterruptedException
		{
			ExtentTestManager.getTest().setDescription("Valid Login Scenario with username and wrong password.AppTest");
	    	
				LoginPage lp = new LoginPage(driver);
				lp.setUserName("abhishek.choudharry@gmail.com");
				lp.setPassword("abc2017#");
				lp.ClickLogin();
				Assert.assertEquals(lp.VerifyLogin(), true, "Page not visbile");
				
	    	
	    	
		}
	}

	


