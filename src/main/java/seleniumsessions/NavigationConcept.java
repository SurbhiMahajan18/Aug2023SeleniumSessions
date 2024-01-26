package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) throws MalformedURLException
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.naveenautomationlabs.com/opencart/");
	System.out.println(driver.getTitle());
	driver.navigate().to("https://google.com");
	System.out.println(driver.getTitle());
	driver.navigate().back();
	System.out.println(driver.getTitle());
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	System.out.println(driver.getTitle());
	driver.navigate().to(new URL("https://www.naveenautomationlabs.com/opencart/"))	;
	
	driver.navigate().refresh();
	}
}
