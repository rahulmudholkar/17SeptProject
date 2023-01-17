package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage login;
	
	@BeforeMethod(alwaysRun = true)
	public void setup() throws Exception
	{
		Initiliazation();
		login = new LoginPage();
		 
	}
	
	@Test(enabled = true,groups = "Regression")
	public void verifyTitleTest() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test(enabled = false)
	public void verifyURLTest() throws Exception
	{
		String expURL = "https://www.saucedemo.com/";
		String actURL = login.verifyURL();
		Assert.assertEquals(actURL, expURL);
	}
	@Test(enabled = false)
	public void verifyLoginLogoTest()
	{
		boolean result = login.verifyLoginLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyBotLogoTest()
	{
		boolean result = login.verifyBotLogo();
		Assert.assertEquals(result, true);
	}
	@Test
	public void loginToAppTest() throws Exception
	{
		String expResult = "https://www.saucedemo.com/inventory.html";
		String actResult = login.loginToApp();
		Assert.assertEquals(expResult, actResult);
	}
//	@Test
//	public void loginApplicationTest() throws Exception
//	{
//		String expResult = "https://www.saucedemo.com/inventory.html";
//		String actResult = login.loginApplication();
//		Assert.assertEquals(expResult, actResult);
//	}
	
	@Test(enabled = false)
	public void loginToApp2Test() throws Exception
	{
		String expResult = "https://www.saucedemo.com/inventory.html";
		String actResult = login.loginToApp2();
		Assert.assertEquals(expResult, actResult);
	}
	@Test(enabled = false)
	public void loginToApp3Test() throws Exception
	{
		String expResult = "https://www.saucedemo.com/inventory.html";
		String actResult = login.loginToApp3();
		Assert.assertEquals(expResult, actResult);
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser()
	{
	  driver.close();
	}
}
