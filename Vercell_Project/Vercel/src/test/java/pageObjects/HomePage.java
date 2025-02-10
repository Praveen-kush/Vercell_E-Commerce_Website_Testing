package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
@FindBy(xpath="//*[name()='path' and contains(@d,'M12 5.9c1.')]")
WebElement lnkMyaccount;


public void clickMyAccount()
{
	lnkMyaccount.click();
}


}
