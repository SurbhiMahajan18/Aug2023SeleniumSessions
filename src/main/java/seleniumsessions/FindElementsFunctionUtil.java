package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsFunctionUtil 
{
	static WebDriver driver;

	public static void main(String[] args)
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		By linksVal = By.tagName("a");
		By imagesVal = By.tagName("img");
//		int linksCount = 	getElementsCount(linksVal);
//		System.out.println(linksCount);
//		int imagesCount = getElementsCount(imagesVal);
//		System.out.println(imagesCount);

		List<String> actualLinksList = getElementsTextList(linksVal);
		
		System.out.println(actualLinksList);
		if(actualLinksList.contains("My Account"))
		{
			System.out.println("My account account ---pass");
		}
		
	List <String> hrefList =getElementsAttributeList(linksVal, "href");
	for(String e: hrefList)
	{
		System.out.println(e);
	}
		
		
	}

	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}


	public static int getElementsCount(By locator)
	{
		return getElements(locator).size();
	}
	
	//WAF to capture specfic attribute from the list
	public static List<String> getElementsTextList(By locator)
	{
	List <WebElement> eleList= getElements(locator);	
	List<String> eleTextList = new ArrayList<String>();
	for(WebElement e:eleList)
	{
		String text = e.getText();
		if(text.length()!=0)
		{
		eleTextList.add(text);	
		}
		
	}
	return  eleTextList;
	}
	
	//WAF to capture the text of all the page links and return list<String>
	public static List<String> getElementsAttributeList(By locator, String attrName)
	{
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleAttriList = new ArrayList <String>();
		for(WebElement e: eleList)
		{
			String attrValue = e.getAttribute(attrName);
			eleAttriList.add(attrValue);
		}
		return eleAttriList;
	
	}
}
