package seleniumsessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	static WebDriver driver;
	
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String email_ID = "input-email";
		String password ="input-password";
		String button = "//*[@id=\"content\"]/div/div[2]/div/form/input";
		String register_linkTest ="Register";
		
		ElementUtil util = new ElementUtil(driver);
		
		util.doSendKeys("id", email_ID, "test@gmail.com");
		util.doSendKeys("id", password, "test@gmail.com");
		util.doSendKeys("xpath", button, "test@gmail.com");
		util.doClick("xpath", button);
		

	}
	
}
