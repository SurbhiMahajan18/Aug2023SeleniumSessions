package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		
		WebElement slider = driver.findElement(By.id("slider"));
		
		int size = slider.getSize().getWidth();
		System.out.println(size);
		
		Actions act = new Actions(driver);
		act.clickAndHold(slider).moveByOffset((size/2)-4000, 0).perform();
		
	}

}
