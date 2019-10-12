package Project.PHPTravel;

import org.testng.annotations.Test;

public class Test_Case_For_Login 
{
	//static Browser_Launch bl = new Browser_Launch();
	//static Home_Page fl = new Home_Page();
	@Test
	public static void Login() throws Exception
	{

		Browser_Launch.Launchbrowser();
		Home_Page.login();
		Home_Page.EnterDetails();
	
	   //fl.Fillhoteldetails();
	}

}
