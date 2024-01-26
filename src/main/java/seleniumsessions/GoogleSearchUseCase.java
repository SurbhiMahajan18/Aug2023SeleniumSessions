package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchUseCase {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://google.com"); 
		
		By searchField = By.name("q");
		String key = "Selenium Automation";
		By suggestions = By.xpath("//div[@class='wM6W7d']/span");
		String suggName = "interview questions";
		
		Search(searchField, suggestions, key, suggName);
		
		}

	public static void Search(By searchField, By suggestions, String key, String suggName) throws InterruptedException
	{
		driver.findElement(searchField).sendKeys(key);;
		Thread.sleep(2000);
		List <WebElement> suggList=driver.findElements(suggestions);
		System.out.println(suggList.size());

		for(WebElement e: suggList)
		{
			String text = e.getText();
			System.out.println(text);
			if(text.contains(suggName))
			{e.click();
			break;
			}
	}
}
}