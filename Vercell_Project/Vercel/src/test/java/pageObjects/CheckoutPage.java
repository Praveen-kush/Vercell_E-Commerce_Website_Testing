package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
	public CheckoutPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(css="//body/div[@id='root']/div[@class='header__container']/div[@class='nav__top__container']/div[@class='top__container']/div[@class='control__bar']/div[@class='control__bar__container']/div[@class='controls__container']/div[@class='control']/span[1]//*[name()='svg']")
	WebElement btncheckout;
	
	@FindBy(xpath="//div[@class='MuiBox-root css-721cb3']")
	WebElement selectcheckoutbox;
	
	@FindBy(xpath="//button[normalize-space()='Checkout']")
	WebElement btnCheckout;
	
	public void setcheckout() {
		btncheckout.click();
	}
	
	public void setcheckoutbox() {
		selectcheckoutbox.click();
	}
	
	public void setCheckout1() {
		btnCheckout.click();
	}

}
