package seleniumsessions;

public class OpenCartTest {

	public static void main(String[] args) 
	{
		BrowserUtil util = new BrowserUtil();
	    //util.driver.get(null); //------------this will give null pointer exception, hence we made driver as private
		util.launchBrowser("chrome");
		util.launchURL("https:www.naveenautomationlabs.com/opencart/");
		String actTitle = util.getPageTitle();
		if(actTitle.equals("Your Store"))
		{
			System.out.println("Title correct ------PASS");
		}
		else
		{
			System.out.println("Title incorrect ------FAIL");
		}
		
		String actURL = util.getPageURL();
		if(actURL.contains("opencart"))
		{
			System.out.println("URL correct--Pass");
		}
		
		//util.closeBrowser();
		//util.quitBrowser();
	}

}
