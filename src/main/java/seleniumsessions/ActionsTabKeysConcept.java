package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabKeysConcept
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver = new EdgeDriver();
//	      driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//	      WebElement userName = driver.findElement(By.id("input-firstname"));
//	      
//	      Actions act=new Actions(driver);
//	      act.sendKeys(userName , "Varna")	
//	      						.sendKeys(Keys.TAB)
//	      						.pause(500)
//	      						.sendKeys("Sharma")
//	      						.pause(500)
//	      						.sendKeys(Keys.TAB)
//	      						.sendKeys("varna@gmail.com")
//	      						.build()
//	      						.perform();
//	      
	      		
	      
	      driver.get("https://amazon.com");
	      WebElement userName = driver.findElement(By.id("twotabsearchtextbox"));
	      
	      Actions act=new Actions(driver);
	      
	      					Action action=	act.sendKeys(Keys.TAB)
	      						.sendKeys(Keys.TAB)
	      						.sendKeys(Keys.TAB)
	      						.sendKeys(Keys.TAB)
	      						.sendKeys(Keys.TAB)
	      						.sendKeys("macbookPro")
	      						.sendKeys(Keys.ENTER).build();
	      						action.perform();
	      
	      		

	}

}
