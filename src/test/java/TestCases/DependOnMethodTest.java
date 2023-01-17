package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class DependOnMethodTest extends TestBase{
	
LoginPage login;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initiliazation();
		login = new LoginPage();
	}
	
	@Test
	public void verifyTitleTest() throws Exception
	{
		//as wrong title name is here,then this method will fail and next loginToApp method will skip.
		String expTitle = "1Swag Labs";   
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test (dependsOnMethods = "verifyTitleTest")
	public void loginToAppTest() throws Exception
	{
		String expResult = "https://www.saucedemo.com/inventory.html";
		String actResult = login.loginToApp();
		Assert.assertEquals(expResult, actResult);
	}
	@AfterMethod
	public void closeBrowser()
	{
	  driver.close();
	}

}
