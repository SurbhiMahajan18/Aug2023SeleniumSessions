package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SVGGraphElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(5000);



		String stateXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']";

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'map-instance')]")));

		List <WebElement>  statesList = driver.findElements(By.xpath(stateXpath));
		System.out.println(statesList.size());


		Actions act = new Actions(driver);
		for(WebElement e : statesList)
		{
			act.moveToElement(e).perform();
			String state = e.getAttribute("id");
			System.out.println(state);
			Thread.sleep(500);

		}



	}

}
