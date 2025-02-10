package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//input[contains(@placeholder,'Search for products')]")
WebElement txtSearchProduct;

@FindBy(xpath="//button[@type='submit']")
WebElement btnSubmit;

@FindBy(xpath="//h1[normalize-space()='No results found for \"Air Force Sneakers\"']")
WebElement confirmMsg;
public void setsearchproduct(String search) {
	txtSearchProduct.sendKeys();
}

public void setSubmit() {
	btnSubmit.click();
}
public boolean setConfirmMSG() {
    return confirmMsg.isDisplayed();
}
}

