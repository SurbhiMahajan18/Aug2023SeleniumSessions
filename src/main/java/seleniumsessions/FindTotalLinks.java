package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTotalLinks {


	//get the total links on the page
	//get the text of each link
	//ignore the blank text links

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		List <WebElement> findAllLinks = driver.findElements(By.tagName("a"));
		System.out.println(findAllLinks.size());
//		for(int i=0;i<findAllLinks.size();i++)
//		{
//			String	text =findAllLinks.get(i).getText();
//			if(text.length()!=0)
//			{
//				System.out.println(i+ ": "  +text);
//			}
//		}
		for(WebElement e: findAllLinks)
		{
		String text = e.getText();
		
		if(text.length()!=0)
		{
			String hrefVal = e.getAttribute(text);
			System.out.println(hrefVal+ "  ===  "  +text);
			
		}
		}
		
	}

}
