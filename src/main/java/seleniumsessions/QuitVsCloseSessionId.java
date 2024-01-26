package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseSessionId {
static WebDriver driver;
	public static void main(String[] args) 
	{
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		String actTitle = driver.getTitle();
//		
//		System.out.println("title is" +actTitle);
//		driver.quit();
//		//System.out.println(driver.getTitle());
//		
//		driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		System.out.println(driver.getTitle());
		
		 driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String actTitle = driver.getTitle();
		System.out.println("Title is " +actTitle);
		driver.close();
		//7bfe
		//System.out.println(driver.getTitle());
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	
		
		driver.quit();
		driver = new ChromeDriver();
		System.out.println(driver.getTitle());
		
//		
		
		
	}

}
