package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
		By country =By.id("Form_getForm_Country");
		WebElement country_ele = driver.findElement(country);
		
		Select select = new Select(country_ele);
		List<WebElement> countryList = select.getOptions();
		System.out.println(countryList.size());
		
		for(WebElement e: countryList )
		{
			String text = e.getText();
			System.out.println(text);
			if(text.equals("India"))
			{
				e.click();
				break;
			}
		
		}	
		
		getDropDownOptionsCount(country);
		getDropDownOptions(country);
		selectDropDownOption(country, "India");
		if (getDropDownOptions(country).contains("India"))
		{
			System.out.println("India -----Pass");
		}
		
	}
	public static WebElement getElement(By locator)
	{
	return	driver.findElement(locator);
	}
	
	public static int getDropDownOptionsCount(By locator)
	{
		Select select = new Select(getElement(locator));
		int size = select.getOptions().size();
		return size;
	}
	
	public static List<String> getDropDownOptions(By locator)
	{
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List <String> optionsTextList = new ArrayList<String>();
		System.out.println(optionsList.size());
		
		for(WebElement e: optionsList )
		{
			String text = e.getText();
			optionsTextList.add(text);
			
	}
		return optionsTextList;
	}
	public static void selectDropDownOption(By locator, String dropDownValue )
	{
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		
		for(WebElement e: optionsList )
		{
			String text = e.getText();
			System.out.println(text);
			if(text.equals("India"))
			{
				e.click();
				break;
			}
		}		
	}
	
	
}
