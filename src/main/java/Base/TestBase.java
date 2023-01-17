package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver; //we are creating driver as a global variable and making driver as a  
	                         //public so that we can access it throughout the project.
	//here static means we are creating single copy of object that will be common for all class.
	public void Initiliazation() throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ReadData.readPropertyFile("url"));
	  //driver.get("https://www.saucedemo.com/");
	}

}
