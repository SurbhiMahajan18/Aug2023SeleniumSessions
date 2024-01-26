package seleniumsessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocatorConcept{

	public static void main(String[] args) throws InterruptedException 
	{
		//Selenium 4 feature : Relative locators
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.linkText("Smithers, Canada"));

		//right of ele:
		String text = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(text);


		//left of ele
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);

		//above of
		String aboveSmithCanada = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveSmithCanada);

		//below of
		String belowSmithCanada = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowSmithCanada);

		//near
		String nearSmithCanada = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearSmithCanada);

		//getMultiple
		List<WebElement> lists=driver.findElements(with(By.xpath("//div[@id='most_pollutedCitiesRank']/p")).below(ele));
		System.out.println(lists.size());
		for(WebElement e: lists)
		{
			System.out.println(e.getText());
		}
	}
}
