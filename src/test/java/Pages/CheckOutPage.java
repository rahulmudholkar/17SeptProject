package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckOutPage extends TestBase{
	
	//object Repository
	@FindBy(xpath = "//span[@class='title']") private WebElement checkoutInfoLogo;
	@FindBy(xpath = "//input[@id='first-name']") private WebElement firstNameBox;
	@FindBy(xpath = "//input[@id='last-name']") private WebElement lastNameBox;
	@FindBy(xpath = "//input[@id='postal-code']") private WebElement postalBox;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement optionBtn;
	@FindBy(xpath = "//button[@id='cancel']") private WebElement cancelBtn;
	@FindBy(xpath = "//input[@id='continue']") private WebElement continueBtn;
	
	public CheckOutPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyCheckoutInfoLogo()
	{
		return checkoutInfoLogo.isDisplayed();
	}
	public void verifyCancelBtn() throws Exception
	{
		firstNameBox.sendKeys("RAHUL");
		Thread.sleep(3000);
		lastNameBox.sendKeys("mudholkar");
		Thread.sleep(3000);
		postalBox.sendKeys("444606");
		Thread.sleep(3000);
		cancelBtn.click();
		Thread.sleep(3000);
	}
	public void verifyOptionBtn()
	{
		optionBtn.click();
	}
	public void verifyTextboxAndContinueBtn() throws Exception 
	{
		firstNameBox.sendKeys("RAHUL");
		Thread.sleep(3000);
		lastNameBox.sendKeys("mudholkar");
		Thread.sleep(3000);
		postalBox.sendKeys("444606");
		Thread.sleep(3000);
		continueBtn.click();
		Thread.sleep(3000);
	}
	public String lastPage() throws Exception
	{
		firstNameBox.sendKeys("RAHUL");
		Thread.sleep(3000);
		lastNameBox.sendKeys("mudholkar");
		Thread.sleep(3000);
		postalBox.sendKeys("444606");
		Thread.sleep(3000);
		continueBtn.click();
		return driver.getCurrentUrl();
	}
	
		
	
}
