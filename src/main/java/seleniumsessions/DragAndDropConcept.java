package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		Actions move= new Actions(driver);
		WebElement srcEle = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement trgEle = driver.findElement(By.cssSelector("div[id='droppable']"));
		
		move.clickAndHold(srcEle).moveToElement(trgEle).release().perform();
		//move.dragAndDrop(srcEle, trgEle).build().perform();
		
	}

}
