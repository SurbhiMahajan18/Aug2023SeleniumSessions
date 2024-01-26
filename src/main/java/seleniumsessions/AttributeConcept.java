package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {

	static WebDriver driver;
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailID = By.id("input-password");
		By registerLink = By.linkText("Register");
		
		String placeholderVal = driver.findElement(emailID).getAttribute("placeholder");
		System.out.println(placeholderVal);
		
	String hrefVal =	driver.findElement(registerLink).getAttribute("href");
	System.out.println(hrefVal);
	String placeholderVal2 = doGetElementAttribute(emailID, "placeholder");
	System.out.println(placeholderVal2);
	String hrefVal1 =doGetElementAttribute(registerLink, "href");
	System.out.println(hrefVal1);
	String valueVal = doGetElementAttribute(emailID, "value");
	System.out.println(valueVal);
	//driver.findElement(By.id("register_link")).getText();
	
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);	
	}
	
	public static String doGetElementAttribute(By locator, String attributeName )
	{
		return getElement(locator).getAttribute(attributeName);	
	}

}
