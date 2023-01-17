package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CartPageTest extends TestBase {
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		Initiliazation();
		login = new LoginPage();
	    invent = new InventoryPage();
	    cart = new CartPage();
	    login.loginToApp();
	    invent.addProduct();
	    
	}
	@Test(enabled = false)
	public void verifyYourCartLogoTest()
	{
		boolean result = cart.verifyYourCartLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyQtyLabelTest()
	{
		boolean result = cart.verifyQtyLabel();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyDiscLabelTest()
	{
		boolean result = cart.verifyDiscLabel();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyAppLogoTest()
	{
		boolean result = cart.verifyAppLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyRemoveBtnAndContinueBtn() throws Exception
	{
		cart.verifyRemoveBtnAndContinueBtn();
	}
	@Test
	public void checkOutPageTest()
	{
		String expResult = "https://www.saucedemo.com/checkout-step-one.html";
		String actResult = cart.checkOutPage();
		Assert.assertEquals(expResult, actResult);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
