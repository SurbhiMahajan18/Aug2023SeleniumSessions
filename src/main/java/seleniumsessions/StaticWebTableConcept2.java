package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableConcept2 
{
	static WebDriver driver;
//get the header for any customer value
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
String text = driver.findElement(By.xpath("(//td[text()='Alfreds Futterkiste']//parent::tr//preceding-sibling::tr//th)[1]")).getText();
		System.out.println(text);
	}

}
