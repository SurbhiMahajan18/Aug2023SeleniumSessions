package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();
	driver.get("http://londonfreelance.org/courses/frames/index.html");
	//driver.switchTo().frame(2);
	
	String text = driver.findElement(By.tagName("h2")).getText();
	driver.switchTo().frame("main");
	System.out.println(text);
	
	
	
	}
}
