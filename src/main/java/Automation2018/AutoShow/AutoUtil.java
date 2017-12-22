package Automation2018.AutoShow;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutoUtil {
	public WebDriver driver;
	
	
	public WebDriver getDriver()
	{
		return this.driver;
	}
	public AutoUtil(String BrowserName)
	{	
		if (BrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Abhishek\\Documents\\AbhishekProjects\\AutoShow\\src\\main\\java\\Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("headless");
	        //options.addArguments("window-size=1200x600");
			driver = new ChromeDriver(options);
		}
		else if (BrowserName.equalsIgnoreCase("ie"))
		{
			driver = new InternetExplorerDriver();
		}
		else
		{
			driver= null;
			System.out.println("No Browser Supplied");
		}
		
			
		
		
	}
    
	public void launchBrowser(String URL)
	{
		driver.get(URL);
		driver.manage().window().maximize();
		//driver.navigate().to(URL);
	}
	
	public void CloseBrowser()
	{
		driver.quit();
	}
 
}
