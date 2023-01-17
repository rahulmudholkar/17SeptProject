package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase{
	
	//object Repository-means whatever element we found that will be written here.
	//if we want element of next page then below type of written xpath useful and it wont show you error.
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement loginLogo;
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(xpath = "//input[@id='user-name']") private WebElement username;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginBtn;

	//here data member are private and methods are public hence it is concept of encapsulation.
	//constructor to initialize the elements of pages.
	//here pagefactory is class and initelements is method which is used to call driver coz we are not
	//taken in xpath hence taken in this bracket and meaning of this is current class.
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyLoginLogo()
	{
		return loginLogo.isDisplayed();
	}
    
	public boolean verifyBotLogo()
	{
		return botLogo.isDisplayed();
	}
	
	public String loginToApp() throws Exception
	{
		 Thread.sleep(2000);
		 //username.sendKeys(ReadData.readPropertyFile("username"));
		 username.sendKeys(ReadData.readExcelFile(0, 0));
		 password.sendKeys(ReadData.readPropertyFile("password"));
		 loginBtn.click();
		 return driver.getCurrentUrl();
		 
    }
	
//	public String loginApplication() throws Exception
//	{
//		Thread.sleep(2000);
//		username.sendKeys("locked_out_user");
//		password.sendKeys("secret_sauce");
//		loginBtn.click();
//		return driver.getCurrentUrl();
//	}

	
	public String loginToApp2() throws Exception
	{
		Thread.sleep(2000);
		username.sendKeys("problem_user");
		password.sendKeys("secret_sauce");
		loginBtn.click();
		return driver.getCurrentUrl();
		
	}
	
	public String loginToApp3() throws Exception
	{
		Thread.sleep(2000);
		username.sendKeys("performance_glitch_user");
		password.sendKeys("secret_sauce");
		loginBtn.click();
		return driver.getCurrentUrl();
		
	}
	
	
	public String verifyTitle() throws Exception
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}
	public String verifyURL() throws Exception
	{
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}


}

// static method = use only static
// non static method = no restriction means we are using driver(static) in non static method.