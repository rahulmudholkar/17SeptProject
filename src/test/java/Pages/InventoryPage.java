package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.UtilityMethod;

public class InventoryPage extends TestBase{
	
	@FindBy(xpath = "//span[text()='Products']") private WebElement productLogo;
	@FindBy(xpath = "//div[@class='peek']") private WebElement peekLogo;
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']") private WebElement sauceLabsBackPackLogo;
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']") private WebElement sauceLabsBikeLightLogo;
	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']") private WebElement sauceLabsBoltLogo;
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']") private WebElement sauceLabsFleeceLogo;
	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']") private WebElement sauceLabsOnesieLogo;
	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']") private WebElement testAllThingsLogo;
	@FindBy(xpath = "//a[text()='Facebook']") private WebElement facebookLogo;
	@FindBy(xpath = "//a[text()='Twitter']") private WebElement twitterLogo;
	@FindBy(xpath = "//a[text()='LinkedIn']") private WebElement linkedlineLogo;
	@FindBy(xpath = "//img[@alt='Swag Bot Footer']") private WebElement swagBotLogo;
	@FindBy(xpath = "//div[@class='footer_copy']") private WebElement footerCopyLogo;
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement sortDropdown;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backpack;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bickLight;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement boltTshirt;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement addCount;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartBtn;
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyPeekLogo()
	{
		return peekLogo.isDisplayed();
	}
	public boolean verifySauceLabsBackPackLogo()
	{
		return sauceLabsBackPackLogo.isDisplayed();
	}
	public boolean verifySauceLabsBikeLightLogo()
	{
		return sauceLabsBikeLightLogo.isDisplayed();
	}
	public boolean verifySauceLabsBoltLogo()
	{
		return sauceLabsBoltLogo.isDisplayed();
	}
	public boolean verifySauceLabsFleeceLogo()
	{
		return sauceLabsFleeceLogo.isDisplayed();
	}
	public boolean verifySauceLabsOnesieLogo()	{
		return sauceLabsOnesieLogo.isDisplayed();
	}
	public boolean verifyTwitterLogo()
	{
		return twitterLogo.isDisplayed();
	}
	public boolean verifyTestAllThingsLogo()
	{
		return testAllThingsLogo.isDisplayed();
	}
	public boolean verifyfacebookLogo()
	{
		return facebookLogo.isDisplayed();
	}
	public boolean verifyLinkedlineLogo()
	{
		return linkedlineLogo.isDisplayed();
	}
	public boolean verifySwagBotLogo()
	{
		return swagBotLogo.isDisplayed();
	}
	public boolean verifyFooterCopyLogo()
	{
		return footerCopyLogo.isDisplayed();
	}
	public String addProduct() throws Exception
	{
		UtilityMethod.selectClass(sortDropdown,"Name (Z to A)");
//		Select s = new Select(sortDropdown);
//		s.selectByVisibleText("Name (Z to A)");
		Thread.sleep(3000);
		backpack.click();
		bickLight.click();
		boltTshirt.click();
		Thread.sleep(3000);
		cartBtn.click();
		return addCount.getText();
	}
	
	public  String cartPage() throws Exception
	{
		Thread.sleep(3000);
		cartBtn.click();
		return driver.getCurrentUrl();
	}
	

}
