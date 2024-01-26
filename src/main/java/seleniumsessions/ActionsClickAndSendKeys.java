package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendKeys
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
      driver = new ChromeDriver();
      driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    
      Actions act = new Actions(driver);
      act.sendKeys(driver.findElement(By.id("input-email")), "naveen@gmail.com").perform();
      act.sendKeys(driver.findElement(By.id("input-password")), "naveen@gmail.com").perform();
      act.click(driver.findElement(By.xpath("//input[@value='Login')]"))).perform();
      
     
      //driver.findElement(By.id)
	}

}
