package Project.PHPTravel;
import org.openqa.selenium.By;

	public class Home_Page extends Browser_Launch{
	static By MyAccount=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	static By Signupbutton=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
	static By loginbutton=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
	static By Email=By.xpath("//input[@placeholder='Email']");
	static By Password=By.xpath("//input[@placeholder='Password']");
	static By LOGIN=By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
	
	//methods
	public static void login()
	{
		driver.findElement(MyAccount).click();
		driver.findElement(loginbutton).click();
	}
	public static void EnterDetails()
	{
		driver.findElement(Email).sendKeys(prop.getProperty("Email"));
		driver.findElement(Password).sendKeys(prop.getProperty("Password"));
		driver.findElement(LOGIN).click();
	}
	
	//main method
	public static void main(String args[])throws Exception
	{
		Launchbrowser();
		login();
		EnterDetails();
	
	}
}
