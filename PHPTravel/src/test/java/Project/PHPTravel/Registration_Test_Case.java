package Project.PHPTravel;
import org.testng.annotations.Test;
public class Registration_Test_Case extends Registration_Page {
	static Browser_Launch bl = new Browser_Launch();
	static Registration_Page rp = new Registration_Page();
@Test
public static void userRegistrationForm() throws Exception
 {
	Browser_Launch.Launchbrowser();
	Registration_Page.Signup();
	Registration_Page.Register();
}
}