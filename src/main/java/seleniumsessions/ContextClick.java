package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
	WebElement contextMenu=driver.findElement(By.cssSelector("span.context-menu-one"));
	
	Actions act = new Actions(driver);
	act.contextClick(contextMenu).perform();
	
	List<WebElement> rtClickOpts = driver.findElements(By.cssSelector("li.context-menu-icon > span"));
	
	for(WebElement e: rtClickOpts)
	{
		String text = e.getText();
		System.out.println(text);
		if(text.equals("Copy"))
		{
			e.click();
			break;
			
		}
	}
	
	}

}
