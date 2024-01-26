package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//WebDriver driver= new EdgeDriver();
		String browser ="chrome";
		
		switch (browser.toUpperCase().trim() ){
		case "CHROME":
			
			 driver =new ChromeDriver();
			System.out.println(driver);
			break;
		case "FIREFOX":
			driver=new FirefoxDriver();
			System.out.println(driver);
			break;
		case "EDGE" :
			 driver=new EdgeDriver();
			System.out.println(driver);
			break;
		default:
			System.out.println(browser+ " -----Pass right broswers----");
			System.out.println(driver);
			break;
		}
		driver.get("http://google.com");
		String actTitle =driver.getTitle();//will give NPE if switch default

		//System.out.println("Title is " +actTitle);
		if(actTitle.equals("Google"))
		{
			System.out.println("Title correct-PASS");
		}

		else
		{
			System.out.println("Incorrect title---FAIL");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pageSrc = driver.getPageSource();
		if(pageSrc.contains("google"))
{
			System.out.println("pass"   );
}
		//System.out.println(pageSrc);
		driver.quit();

	}

}
