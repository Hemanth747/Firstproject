package Project.PHPTravel;
import org.openqa.selenium.By;
	public class Registration_Page extends Home_Page{
	static By First_Name=By.xpath("//input[@placeholder='First Name']");
	static By Last_Name=By.xpath("//input[@placeholder='Last Name']");
	static By Mobile=By.xpath("//input[@placeholder='Mobile Number']");
	static By Email=By.xpath("//input[@placeholder='Email']");
	static By Password=By.xpath("//input[@placeholder='Password']");
	static By Confirm_Password=By.xpath("//input[@placeholder='Confirm Password']");
	static By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	static By Sig=By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
//methods
	public static void Register()
	{
	driver.findElement(First_Name).sendKeys(prop.getProperty("First_Name"));
	driver.findElement(Last_Name).sendKeys(prop.getProperty("Last_Name"));
	driver.findElement(Mobile).sendKeys(prop.getProperty("Mobile"));
	driver.findElement(Email).sendKeys(prop.getProperty("Email"));
	driver.findElement(Password).sendKeys(prop.getProperty("Password"));
	driver.findElement(Confirm_Password).sendKeys(prop.getProperty("Confirm_Password"));
	driver.findElement(cookies).click();
	driver.findElement(Sig).click();
	}
	
	public static void Signup() {
	driver.findElement(MyAccount).click();
	driver.findElement(Signupbutton).click();
	}
	
	
	public static void main(String[] args) throws Exception {
		// main method
		Launchbrowser();
		Signup();
        Register();
	}

}

