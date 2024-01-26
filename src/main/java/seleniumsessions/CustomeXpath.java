package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomeXpath {
static WebDriver driver;
	public static void main(String[] args) 
	{
		//xpath: address of the element in HTML DOM
		// Absolute path
		// relative path
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		int links =driver.findElements(By.xpath("//a")).size();
		System.out.println(links);
		
	List <WebElement> linkslist =driver.findElements(By.xpath("//a[@class='list-group-item']"));
	for(WebElement e: linkslist)
	{
		String text=e.getText();
		System.out.println(text);
	}
	}
	

}
