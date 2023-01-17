package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase{
	
	@FindBy(xpath = "//span[text()='Your Cart']") private WebElement yourCartLogo;
	@FindBy(xpath = "//div[@class='cart_quantity_label']") private WebElement qtyLabel;
	@FindBy(xpath = "//div[@class='cart_desc_label']") private WebElement discLabel;
	@FindBy(xpath = "//button[@class='btn btn_secondary btn_small cart_button']") private WebElement removeBtn;
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement applogo;
	@FindBy(xpath = "//button[@id='continue-shopping']") private WebElement continueBtn;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement onesiaCart;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement addToCart;
	@FindBy(xpath = "//button[@id='checkout']") private WebElement checkoutBtn;
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
		
		
	}
	public boolean verifyYourCartLogo()
	{
		return yourCartLogo.isDisplayed();
	}
	public boolean verifyQtyLabel()
	{
		return qtyLabel.isDisplayed();
	}
	public boolean verifyDiscLabel()
	{
		return discLabel.isDisplayed();
	}
	public boolean verifyAppLogo()
	{
		return applogo.isDisplayed();
	}
	public void verifyRemoveBtnAndContinueBtn() throws Exception
	{
		removeBtn.click();
		Thread.sleep(3000);
		continueBtn.click();
		Thread.sleep(3000);
		onesiaCart.click();
		Thread.sleep(3000);
		addToCart.click();
		Thread.sleep(3000);
		checkoutBtn.click();
		Thread.sleep(3000);

	}
	public String checkOutPage()
	{
		checkoutBtn.click();
		return driver.getCurrentUrl();
	}
	
}
