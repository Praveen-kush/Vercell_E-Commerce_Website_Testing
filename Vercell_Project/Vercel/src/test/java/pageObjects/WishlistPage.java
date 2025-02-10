package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends BasePage {
    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/shop']")
    WebElement clickShop;

    @FindBy(css = "a[href='/item/men/630b7c690dd4ac34455cb262']")
    WebElement selectItem;

    @FindBy(xpath = "(//button[contains(@type,'button')])[9]")
    WebElement addToWishlist;

    @FindBy(xpath = "//div[contains(@class,'control__bar')]//div[2]")
    WebElement viewWishlist;

    @FindBy(css = "//div[contains(@class,'control__bar')]//div[2]")  // Adjust based on actual class
    WebElement wishlistItem;

    public void navigateToShop() {
        clickShop.click();
    }

    public void selectItemToAdd() {
        selectItem.click();
    }

    public void addToWishlist() {
        addToWishlist.click();
    }

    public void openWishlist() {
        viewWishlist.click();
    }

    public boolean isItemInWishlist() {
        return wishlistItem.isDisplayed();
    }
}
