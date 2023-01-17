package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class SoftAssertion extends TestBase {
	
	//Remember one note-hard assert will fail your method directly but sort assert does not fail your method.
	//and if there is an exception in soft assert and you want to throw then use assertAll method.
	
	LoginPage login;
	InventoryPage invent;
	@BeforeMethod
	public void setup() throws Exception
	{
		Initiliazation();
		login = new LoginPage();
	    invent = new InventoryPage();
	    login.loginToApp();
		
	}
	//if we failed test case,still test case will passed in console in soft assertion.means in soft assertion
	//soft assertion madhe tumchi test case fail hot asel tr tumchi method tyala fail nahi karat.
	@Test(enabled = true)
	public void verifyPeekLogoTest()
	{
		System.out.println("execution started");
		SoftAssert soft = new SoftAssert();
		boolean result = invent.verifyPeekLogo();
		soft.assertEquals(result, false);
		System.out.println("execution ended");
		soft.assertAll();//this method will throw an exception in soft assert.
		                 //soft assert collect all the error but will not throw those error and those error
		                 //will thrown by assertAll method.
	}
 
	@AfterMethod
	public void closeBrowser()
	{
	  driver.close();
	}

}
