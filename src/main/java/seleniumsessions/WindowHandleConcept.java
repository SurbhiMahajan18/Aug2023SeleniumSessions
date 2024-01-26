package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();//child
		
		Set<String> handles = driver.getWindowHandles();
		
	Iterator <String> it= handles.iterator();
	String parentWindowID = it.next();
	System.out.println("Parent window is " +parentWindowID);
	Thread.sleep(3000);
	String childWindowID = it.next();
	System.out.println("Child window is " +childWindowID);
	Thread.sleep(3000);
	driver.switchTo().window(childWindowID);
	System.out.println("child window is " +driver.getCurrentUrl());
	
	driver.close();
	
	}
	

	
}

