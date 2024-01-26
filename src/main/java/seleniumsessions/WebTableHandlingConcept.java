package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandlingConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		////a[text()='Joe.Root']/parent::td/preceding-sibling::td//input[@type='checkbox']
		////a[text()='Jasmine.Morgan']/parent::td/preceding-sibling::td//input[@type='checkbox']
		
	driver=new ChromeDriver();
	driver.get("https://selectorshub.com/xpath-practice-page/");
	Thread.sleep(4000);
	selectUserCheckBox("Garry.White");
	selectUserCheckBox("Joe.Root");
	List<String> joeDetails = getUserInfo("Joe.Root");
	System.out.println(joeDetails);
	}
	
	//Classic CRM
	////a[text()='Neha Kapoor']/parent::td//preceding-sibling::td//input[@type='checkbox']
	
	public static void selectUserCheckBox(String userName)
	{
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td//input[@type='checkbox']")).click();
		
	}

	public static List<String> getUserInfo(String userName)
	{
		List<WebElement> colEles = driver.findElements(By.xpath("//a[text()='"+userName+"']//parent::td//following-sibling::td"));
		List<String> tdValues = new ArrayList<String>();
		for(WebElement e: colEles)
		{
			String text = e.getText();
			tdValues.add(text);
			
		}
		return tdValues;
		
	
		
	}
}
