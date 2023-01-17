package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckOutPage;
import Pages.InventoryPage;
import Pages.LastPage;
import Pages.LoginPage;

public class LastPageTest extends TestBase{
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckOutPage checkout;
	LastPage last;
	@BeforeMethod
	public void setup() throws Exception
	{
		Initiliazation();
	    login = new LoginPage();
	    invent = new InventoryPage();
	    cart = new CartPage();
	    checkout = new CheckOutPage(); 
	    last = new  LastPage();
	    login.loginToApp();
	    invent.addProduct();
	    cart.checkOutPage();
	    checkout.lastPage();
	}
	@Test(enabled = false)
	public void verifyOverviewLogoTest()
	{
		boolean result = last.verifyOverviewLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyPaymentInfoLogoTest()
	{
		boolean result = last.verifyPaymentInfoLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyCardLogoTest()
	{
		boolean result = last.verifyCardLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyPonyLogoTest()
	{
		boolean result = last.verifyPonyLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifySubtotalLabelTest()
	{
		boolean result = last.verifySubtotalLabel();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyTaxLabelTest()
	{
		boolean result = last.verifyTaxLabel();
		Assert.assertEquals(result,true);
	}
	@Test(enabled = false)
	public void verifyTotalLabelTest()
	{
		boolean result = last.verifyTotalLabel();
		Assert.assertEquals(result,true);
	}
	@Test(enabled = false)
	public void verifyCancelBtnTest()
	{
		last.verifyCancelBtn();
		
	}
	@Test
	public void verifyFinishBtnTest()
	{
	    last.verifyFinishBtn();;
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
