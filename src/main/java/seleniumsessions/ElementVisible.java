package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisible {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//		
		//	WebElement logo = 	driver.findElement(By.cssSelector("img.img-responsive"));
		//
		//	System.out.println(logo.isDisplayed());
		//	System.out.println(logo.isEnabled());
		//	


		driver.get("https://classic.freecrm.com/register/");

		//Submit button selected or not
		WebElement submitButton = driver.findElement(By.id("submitButton"));
		System.out.println("Submit button is displayed or not?  " +submitButton.isDisplayed());
		System.out.println("Submit button is Enabled or not?  "  +submitButton.isEnabled());
		System.out.println("Submit button is Selected or not?  " +submitButton.isSelected());

		boolean f= driver.findElement(By.name("agreeTerms")).isSelected();
		Thread.sleep(2000);
		System.out.println("belore aggreeing on terms: " +f);

		driver.findElement(By.name("agreeTerms")).click();
	boolean f1 = 	driver.findElement(By.name("agreeTerms")).isSelected();
	System.out.println("after aggreeing on terms: " +f1);
	}
	
	
	

}