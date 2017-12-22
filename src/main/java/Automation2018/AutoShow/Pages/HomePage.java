package Automation2018.AutoShow.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	HomePage(WebDriver driver)
	{
		this.driver= driver;
	}
	@FindBy(name= "findFlights") private WebElement findFlights;
	@FindBy(id= "password") private WebElement password;
	@FindBy(id= "login") private WebElement loginBtn;
	
	
	
	  
}
