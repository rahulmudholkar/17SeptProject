package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.UtilityMethod;

public class CaptureScreenshotForFailed extends TestBase {
	
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
		String expTitle = "Swag. Labs";
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
	public void loginToApp3Test() throws Exception
	{
		String expResult = "https://www.saucedemo.com/inventory.html";
		String actResult = login.loginToApp3();
		Assert.assertEquals(expResult, actResult);
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser(ITestResult a) throws Exception
	{
		if(ITestResult.FAILURE == a.getStatus())
		{
			UtilityMethod.captureScreenshot(a.getName());
		}
	    driver.close();
	}

}
