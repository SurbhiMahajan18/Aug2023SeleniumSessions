package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);	
	}

	public static void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil dri = new BrowserUtil();
		dri.launchBrowser("chrome");
		dri.launchURL("https://naveenautomationlabs.com/wp-login.php");
		
	By userLogin =	By.cssSelector("#user_login");
	By pass =By.cssSelector("/html/body/div[1]/form/div/div/input");
	
	By submit = By.cssSelector("#wp-submit");
	
	doSendKeys(userLogin, "Surbhi");
	doSendKeys(pass, "Surbhi@123");
	doClick(submit);		
	}

}
