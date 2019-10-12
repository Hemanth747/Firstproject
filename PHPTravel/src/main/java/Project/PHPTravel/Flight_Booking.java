package Project.PHPTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Flight_Booking extends Browser_Launch {
   static By Flight=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]");
   static By From_city=By.xpath("//div[@id='s2id_origin']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
   static By From_city1=By.xpath("//*[@id=\"select2-drop\"]/div/input");
   static By To_city=By.xpath("//div[@id='s2id_destination']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
   static By To_city1=By.xpath("//div[@id='s2id_destination']//a[@class='select2-choice select2-default']");
   static By check_in=By.xpath("//input[@id='departure']");
   static By guest=By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']");
   
   public static void Fill_flight_Details() throws InterruptedException
   {
	   //From_City
	   driver.findElement(Flight).click();
	   Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='thflights']/div[9]/div[1]/div/label")).click();
	   driver.findElement( From_city).click();
	   
	   driver.findElement( From_city1).sendKeys(prop.getProperty("FCity_name"));
	   driver.findElement(From_city1).sendKeys((Keys.DOWN));
	   Thread.sleep(1000);
	   driver.findElement(From_city1).sendKeys(Keys.ENTER);
	   
	   
	   //To_city
	   driver.findElement(To_city).click();
	   driver.findElement(To_city1).sendKeys(prop.getProperty("FCity_Name1"));
	   driver.findElement(To_city1).sendKeys((Keys.DOWN));
	   Thread.sleep(1000);
	   driver.findElement(To_city1).sendKeys(Keys.ENTER);
	   
	   //Check_In
	   driver.findElement(check_in).click();
		
		Thread.sleep(2000);
	while(true)	
	{
	String text=driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[2]")).getText();
	if(text.equals(prop.getProperty("Chek_Inmonth")))
	{
		break;
	}
	else
	{
		driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[3]")).click();
	}
	}
		driver.findElement(By.xpath("//div[16]//tr//td[contains(text(),"+prop.getProperty("Chek_Inday")+")]")).click();
		driver.findElement(guest).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='madult']")).click();
		driver.findElement(By.xpath("//select[@id='madult']//option[contains(text(),"+prop.getProperty("Adults")+")]")).click();
		driver.findElement(By.xpath("//select[@id='mchildren']")).click();
		driver.findElement(By.xpath("//select[@id='mchildren']//option[contains(text(),"+prop.getProperty("Children")+")]")).click();
		driver.findElement(By.xpath("//button[@id='sumManualPassenger']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn-primary btn btn-lg btn-block pfb0']")).click();
		
   }
	public static void main(String[] args) throws Exception {
	  Launchbrowser();
	  Fill_flight_Details();
}
}
