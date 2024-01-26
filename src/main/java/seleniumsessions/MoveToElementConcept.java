package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		//Actions class
		driver= new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

//		Actions move= new Actions(driver);
		By parentMenu = By.cssSelector("a.menulink");
//
//		move.moveToElement(driver.findElement(parentMenu)).perform();
//		Thread.sleep(2000);
       By childMenu = By.linkText("COURSES");
		
		
		parentChildMenu(parentMenu, childMenu);
		
	}

	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static void parentChildMenu(By parentMenuLocator, By childMenuLocator) throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.moveToElement(getElement(parentMenuLocator)).perform();
		Thread.sleep(2000);
		getElement(childMenuLocator).click();
	}

}
