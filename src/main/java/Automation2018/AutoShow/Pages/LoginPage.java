package Automation2018.AutoShow.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		this.wait= new WebDriverWait(driver,30);
		PageFactory.initElements(this.driver, this);
	}
	@FindBy(name= "userName") private WebElement userName;
	@FindBy(name= "password") private WebElement password;
	@FindBy(name= "login") private WebElement loginBtn;
	@FindBy(name= "findFlights") private WebElement findFlights;
	
	public void setUserName(String UserName)
	{
		wait.until(ExpectedConditions.elementToBeClickable(userName));
		userName.sendKeys(UserName);
	}

	public void setPassword(String Password)
	{
		wait.until(ExpectedConditions.elementToBeClickable(userName));
		password.sendKeys(Password);
	}
	
	public void ClickLogin()
	{
		wait.until(ExpectedConditions.elementToBeClickable(userName));
		loginBtn.click();
	}
	
	public boolean VerifyLogin()
	{
		boolean bool = false;
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
		wait.until(ExpectedConditions.visibilityOf(findFlights));
		bool = findFlights.isDisplayed() && findFlights.isEnabled() ? true : false;
		return bool;
	}

}
