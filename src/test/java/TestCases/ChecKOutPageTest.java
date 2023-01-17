package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckOutPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class ChecKOutPageTest extends TestBase {
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckOutPage checkout;
	@BeforeMethod
	public void setup() throws Exception
	{
		Initiliazation();
		 login = new LoginPage();
	     invent = new InventoryPage();
	     cart = new CartPage();
	     checkout = new CheckOutPage(); 
	     login.loginToApp();
	     invent.addProduct();
	     cart.checkOutPage();
	}
	@Test(enabled = false)
	public void verifyCheckoutInfoLogoTest()
	{
		boolean result = checkout.verifyCheckoutInfoLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyCancelBtnTest() throws Exception
	{
		checkout.verifyCancelBtn();
	}
	@Test(enabled = false)
	public void verifyOptionBtnTest()
	{
		checkout.verifyOptionBtn();
	}
	@Test(enabled = false)
	public void verifyTextboxAndContinueBtnTest() throws Exception
	{
		checkout.verifyTextboxAndContinueBtn();
	}
	@Test
	public void lastPageTest() throws Exception
	{
		String expResult = "https://www.saucedemo.com/checkout-step-two.html";
		String actResult = checkout.lastPage();
		Assert.assertEquals(expResult, actResult);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
