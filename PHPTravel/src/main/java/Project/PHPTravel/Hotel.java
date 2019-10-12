package Project.PHPTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import Automation1.Phptravels.Launch;
public class Hotel extends Browser_Launch  {
	static By Hotel=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]");
	static By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	static By Hotelcity=By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	static By Hotelcity1=By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
    static By checkin=By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
    static By select=By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li/div");
    static By checkout=By.xpath("//input[@placeholder='Check out']");
    static By guest=By.xpath("//input[@id='htravellersInput']");
    
    //methods
	public static void Fillhoteldetails() throws InterruptedException
	{   //Hotel/city_Search field
		//driver.findElement(cookies).click();
		driver.findElement(Hotel).click();
	
		
		driver.findElement(Hotelcity).click();
		driver.findElement(Hotelcity1).sendKeys(prop.getProperty("City_Name"));
		driver.findElement(Hotelcity1).sendKeys((Keys.DOWN));
		
		Thread.sleep(3000);
		driver.findElement(select).click();
	
		//Checkin 
		driver.findElement(checkin).click();
		Thread.sleep(2000);
	while(true)	
	{
	String text=driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[2]")).getText();
	if(text.equals(prop.getProperty("Check_in_Month")))
	{
		break;
	}
	else
	{
		driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[3]")).click();
	}
	}
		
		driver.findElement(By.xpath("//div[14]//tr//td[contains(text(),"+prop.getProperty("Day")+")]")).click();
	
	Thread.sleep(2000);
	
	while(true)	
	{
	String text=driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[2]")).getText();
	if(text.equals(prop.getProperty("Check_Out_month")))
	{
		break;
	}
	else
	{
	driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[3]")).click();
	text=driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[2]")).getText();
	}
	}
	driver.findElement(By.xpath("//div[15]//tr//td[contains(text(),"+prop.getProperty("day")+")]")).click();
				
	 //Guestfield
	driver.findElement(guest).click();
	driver.findElement(By.xpath("//button[@id='hadultPlusBtn']")).click();
	driver.findElement(By.xpath("//button[@id='hchildPlusBtn']")).click();
	driver.findElement(guest).click();
		
	 //Search button
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")).click();
	}

	public static void main(String[] args) throws Exception
	{
		Launchbrowser();
	    Fillhoteldetails();
	}

}
