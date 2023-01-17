package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LastPage extends TestBase{
	
	@FindBy(xpath = "//span[text()='Checkout: Overview']") private WebElement overviewLogo;
	@FindBy(xpath = "//div[text()='Payment Information:']") private WebElement paymentInfoLogo;
	@FindBy(xpath = "//div[text()='SauceCard #31337']") private WebElement cardLogo;
	@FindBy(xpath = "//div[text()='FREE PONY EXPRESS DELIVERY!']") private WebElement ponyLogo;
	@FindBy(xpath = "//div[@class='summary_subtotal_label']") private WebElement subtotalLabel;
	@FindBy(xpath = "//div[@class='summary_tax_label']") private WebElement taxLabel;
	@FindBy(xpath = "//div[@class='summary_total_label']") private WebElement totalLabel;
	@FindBy(xpath = "//button[@id='cancel']") private WebElement cancelBtn;
	@FindBy(xpath = "//button[@id='finish']") private WebElement finishBtn;
	
	public LastPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyOverviewLogo()
	{
		return overviewLogo.isDisplayed();
	}
	public boolean verifyPaymentInfoLogo()
	{
		return paymentInfoLogo.isDisplayed();
	}
	public boolean verifyCardLogo()
	{
		return cardLogo.isDisplayed();
	}
	public boolean verifyPonyLogo()
	{
		return ponyLogo.isDisplayed();
	}
	public boolean verifySubtotalLabel()
	{
		return subtotalLabel.isDisplayed();
	}
	public boolean verifyTaxLabel()
	{
		return taxLabel.isDisplayed();
	}
	public boolean verifyTotalLabel()
	{
		return totalLabel.isDisplayed();
	}
	public void verifyCancelBtn()
	{
		cancelBtn.click();
	}
	public void verifyFinishBtn()
	{
		finishBtn.click();
	}

}
