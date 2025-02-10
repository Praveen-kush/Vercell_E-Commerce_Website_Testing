package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(@class,'css-rg8r61')]")
    WebElement clickshopnow;

    @FindBy(xpath = "//div[@id='root']//div[1]//div[2]//div[1]//div[1]//div[1]//div[2]//div[1]//a[1]")
    WebElement addshoes;

    @FindBy(css = "button:contains('ADD TO BAG')")
    WebElement addToBag;

    public void setshopnow() {
        clickshopnow.click();
    }

    public void setshoes() {
        addshoes.click();
    }

    public void setaddToBag() {
        addToBag.click();
    }
}
