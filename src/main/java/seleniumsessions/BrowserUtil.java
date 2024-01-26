package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/** @author surbh
 * BrowserUtil is having multiple methods to handle the various browser actions
 */

public class BrowserUtil 
{
	private WebDriver driver;

	/**
	 * This method is used to launch the browser on the basis of given browser name
	 * @param browser - 
	 * @return - this returns driver instance
	 */
	public WebDriver launchBrowser(String browser)
	{
		System.out.println("Browser name : "  +browser);
		switch (browser.toUpperCase().trim() ){
		case "CHROME":

			driver =new ChromeDriver();
			System.out.println(driver);
			break;
		case "FIREFOX":
			driver=new FirefoxDriver();
			System.out.println(driver);
			break;
		case "EDGE" :
			driver=new EdgeDriver();
			System.out.println(driver);
			break;
		default:
			System.out.println(browser+ " -----Pass right broswers----");
			throw new AutomationException("Invalid Browser // name = " +browser);

		}
		return driver;
	}
	
	
// This method is used to launch the URL
	public void launchURL(String url)
	{
		if(url==null)
		{
			System.out.println("URL is null");
			throw new AutomationException("Invalid URL");
		}
		if(url.indexOf("http")==0)
		{
			driver.get(url);
		}
		else
		{
			throw new AutomationException("HTTP is missing");
		}
	}
	
	public void launchURL(URL url)
	{
		if(url==null)
		{
			System.out.println("URL is null");
			throw new AutomationException("Invalid URL");
		}
	driver.navigate().to(url);
	}
	

	//This method is used to get the title of the page
	public String getPageTitle()
	{
		String title = driver.getTitle();
		System.out.println("Page title is:  " +title);
		return title;

	}

	//This method is used to get page URL
	public String getPageURL()
	{
		String URL = driver.getCurrentUrl();
		return URL;	
	}

	//THIS method is a check if the page source contains a given expected value
	public boolean getPageSource(String expvaluePageSrc)
	{
		String actvaluePageSrc =  driver.getPageSource();
		if(expvaluePageSrc.contains(actvaluePageSrc))
		{
			return true;
		}
		return false;
	}

	//This is to close browser
	public void closeBrowser() 
	{
		driver.close();
		System.out.println("Browser closed ......");
	}

	//used to quit Browser
	public void quitBrowser() {
		driver.quit();
	}


}

