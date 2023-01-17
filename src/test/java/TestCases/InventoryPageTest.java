package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public  class InventoryPageTest extends TestBase {
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
	@Test(enabled = false)
	public void verifyPeekLogoTest()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifySauceLabsBackPackLogoTest()
	{
		boolean result = invent.verifySauceLabsBackPackLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifySauceLabsBikeLightLogoTest()
	{
		boolean result = invent.verifySauceLabsBikeLightLogo();
	    Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifySauceLabsBoltLogoTest()
	{
		boolean result = invent.verifySauceLabsBoltLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifySauceLabsFleeceLogoTest()
	{
		boolean result = invent.verifySauceLabsFleeceLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifySauceLabsOnesieLogoTest()
	{
		boolean result = invent.verifySauceLabsOnesieLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyTwitterLogoTest()
	{
		boolean result = invent.verifyTwitterLogo();
		Assert.assertEquals(result, true);
	}
	
	
	@Test(enabled = false)
	public void verifyTestAllThingsLogoTest()
	{
		boolean result = invent.verifyTestAllThingsLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyfacebookLogoTest()
	{
		boolean result = invent.verifyfacebookLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyLinkedlineLogoTest()
	{
		boolean result = invent.verifyLinkedlineLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void  verifySwagBotLogoTest()
	{
		boolean result = invent.verifySwagBotLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyFooterCopyLogoTest()
	{
		boolean result = invent.verifyFooterCopyLogo();
		Assert.assertEquals(result, true);
    }
	@Test
	public void addProductTest() throws Exception
	{
		String result = invent.addProduct();
		Assert.assertEquals(result, "3");
	}	
	@Test
	public void cartPageTest() throws Exception
    {
	 String expResult = "https://www.saucedemo.com/cart.html";
	 String actResult = invent.cartPage();
	 Assert.assertEquals(expResult, actResult);
    }
    @AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
