package Project.PHPTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Car_Booking extends Browser_Launch {
	static By cars=By.xpath("//span[contains(text(),'Cars')]");
	static By picup_loction=By.xpath("//div[@id='s2id_carlocations']//span[@class='select2-chosen'][contains(text(),'Location')]");
	static By picup_loction1=By.xpath("//div[@id='s2id_carlocations']//a[@class='select2-choice']");
	static By pick_date=By.xpath("//input[@id='departcar']");
	static By time=By.xpath("//select[@name='pickupTime']");
	static By time1=By.xpath("//select[@name='dropoffTime']");
	
	
	
	public static void Fillcardetails() throws InterruptedException
	{
		// picup_loction
	driver.findElement(cars).click();
	driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
	driver.findElement(picup_loction).click();
	driver.findElement(picup_loction1).sendKeys(prop.getProperty("Loctaion1"));
	 Thread.sleep(1000);
	 driver.findElement(picup_loction1).sendKeys(Keys.ENTER);
	   
	   //pick_date
	 driver.findElement(pick_date).sendKeys(Keys.TAB);

		Thread.sleep(2000);
	while(true)	
	{
	String text=driver.findElement(By.xpath("//div[12]//div[1]//tr[1]//th[2]")).getText();
	if(text.equals(prop.getProperty("pick_month1")))
	{
		break;
	}
	else
	{
		driver.findElement(By.xpath("//div[12]//div[1]//tr[1]//th[3]")).click();
	}
	}
		
		driver.findElement(By.xpath("//div[12]//tr//td[contains(text(),"+prop.getProperty("pick_day1")+")]")).click();

		//drop_date
		   driver.findElement(pick_date).sendKeys(Keys.TAB);
		
			Thread.sleep(2000);
		while(true)	
		{
		String text=driver.findElement(By.xpath("//div[13]//div[1]//tr[1]//th[2]")).getText();
		if(text.equals(prop.getProperty("drop_month1")))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//div[13]//div[1]//tr[1]//th[3]")).click();
		}
		}
			
			driver.findElement(By.xpath("//div[13]//tr//td[contains(text(),"+prop.getProperty("drop_day1")+")]")).click();
		
	//pick_time
		driver.findElement(time).click();
		driver.findElement(By.xpath("//*[@id=\"cars\"]/form/div[4]/div/select/option[7]")).click();
		
	//drop_time
		driver.findElement(time1).click();
	    driver.findElement(By.xpath("//*[@id=\"cars\"]/form/div[6]/div/select/option[20]")).click();
	   
	  //search
	    driver.findElement(By.xpath("//div[@class='bgfade col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]")).click();//div[@class='bgfade col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]
	
	}

	public static void main(String[] args) throws Exception {
		 Launchbrowser();
		 Fillcardetails();

	}

}
