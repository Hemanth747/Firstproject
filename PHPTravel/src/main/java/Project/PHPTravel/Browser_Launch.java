package Project.PHPTravel;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Browser_Launch {
	public static WebDriver driver;
	public static Properties prop=new Properties();
	
	//methods
	public static void Launchbrowser() throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\eclipssss\\chromedriver.exe");
	driver= new ChromeDriver();
	FileInputStream fis=new FileInputStream("D:\\eclips\\drives\\PHPTravel\\src\\main\\java\\Project\\PHPTravel\\data.properties");
	prop.load(fis);
	driver.get(prop.getProperty("HOST"));
	driver.manage().window().maximize();
}
public static void main(String args[]) throws Exception
{
	Launchbrowser();
}

}

