package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForTitleUrl {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();


		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.findElement(By.linkText("About Us")).click();
		//		
		//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//		if(wait.until(ExpectedConditions.titleContains("About"))) {
		//			System.out.println(driver.getTitle());
		//		}
		//		else {
		//		System.out.println("title is not present ...........");
		//			
		//		}
		String title = waitforTitleContains("About11", 5);
		System.out.println(title);
	}


	public static String waitforTitleContains(String titleFraction, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try{if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		}
		}
		catch(TimeoutException e) {
			System.out.println(titleFraction+ " title value not present");
			e.printStackTrace();
		}
	return null;
	}
	
	public static String waitforTitleIs(String title, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try{if(wait.until(ExpectedConditions.titleIs(title))) {
			return driver.getTitle();
		}
		}
		catch(TimeoutException e) {
			System.out.println(title+ " title value not present");
			e.printStackTrace();
		}
	return null;
	}
	
	
	public static String waitforURLContains(String url, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try{if(wait.until(ExpectedConditions.titleContains(url))) {
			return driver.getCurrentUrl();
		}
		}
		catch(TimeoutException e) {
			System.out.println(url+ " URL value not present");
			e.printStackTrace();
		}
	return null;
	}
	
	public static String waitforURLToe(String fullurl, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try{if(wait.until(ExpectedConditions.urlToBe(fullurl))) {
			return driver.getCurrentUrl();
		}
		}
		catch(TimeoutException e) {
			System.out.println(fullurl+ " URL value not present");
			e.printStackTrace();
		}
	return null;
	}

}


