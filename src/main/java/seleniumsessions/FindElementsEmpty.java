package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEmpty {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
driver=new ChromeDriver();
driver.get("naveen");

By.cssSelector(()
	}

	
	public static boolean checkElementPresent(By locator)
	{
	 return driver.findElements(locator).size()>0?	true : false;
	}

	}
