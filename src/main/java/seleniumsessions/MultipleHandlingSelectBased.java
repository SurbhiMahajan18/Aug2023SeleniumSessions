package seleniumsessions;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultipleHandlingSelectBased {
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver= new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");

		Select select = new Select(driver.findElement(By.xpath("//select")));
		if (select.isMultiple())
		{
			//			select.selectByVisibleText("Chilean flamingo");
			//			select.selectByVisibleText("Lesser flamingo");
			//			select.selectByVisibleText("Andean flamingo");
			//			select.deselectByVisibleText("Chilean flamingo");
			//			
			//			int selected = select.getAllSelectedOptions().size();
			//			System.out.println(selected);
			By dropdownlocator = By.xpath("//select");

			//Test Case 1: To select Multiple drop down values
			selectDropDownMultipleValues(dropdownlocator, "Lesser flamingo","Andean flamingo" );

			//Test Case 2:  Single Value
			selectDropDownMultipleValues(dropdownlocator, "Lesser flamingo");

			//Test Case 3: Select All Values
			selectDropDownMultipleValues(dropdownlocator, "all");	
		}
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);	
	}

	public static boolean isDropDownMultiple(By locator)
	{
		Select select = new Select(getElement(locator));
		if (select.isMultiple())
		{
			return true;
		}
		return false;
	}
	public static void selectDropDownMultipleValues(By locator,String...values)
	{
		Select select = new Select(getElement(locator));

		if (isDropDownMultiple(locator)) {

			for(String value: values)
			{
				if(values[0].equalsIgnoreCase("all"))
				{

				}
				select.selectByVisibleText(value);
			}
		}
	}
}