
package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsConcept {

	static WebDriver driver;
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	//1st method
//		driver.findElement(By.id("input-email")).sendKeys("rahul@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("rahul123");
	
	//2nd method
//	WebElement user =	driver.findElement(By.id("input-email"));
//	WebElement pass1 = driver.findElement(By.id("input-password"));
//	
//	user.sendKeys("rahul,@gmail.com");
//	pass1.sendKeys("rahul123");
//	
	//3rd method
//		By eid =By.id("input-email");
//		By pass = By.id("input-password");
//		driver.findElement(eid).sendKeys("rahul@gmail.com");
//		driver.findElement(pass).sendKeys("rahul123");
		
	//4th
		By eid =By.id("input-email");
		By pass = By.id("input-password");
	
		ElementUtil util=new ElementUtil(driver);
		util.doSendKeys(eid, "rahul@gmail.com");
		util.doSendKeys(pass, "rahul123");
		
		
//		doSendKeys(eid, "rahul@gmail.com");
//		doSendKeys(pass, "rahul123");
//		
	}
	//we moved it to ElementsUtil, separate class
//		public static WebElement getElement(By locator)
//		{
//			return driver.findElement(locator);	
//		}
//	
//		public static void doSendKeys(By locator, String value)
//		{
//			getElement(locator).sendKeys(value);
//		}
////7th approach
	
	
	}


