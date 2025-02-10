package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.WishlistPage;
import testBase.BaseClass;

public class WishlistTest extends BaseClass {

    @Test
    public void testAddToWishlist() {
        WishlistPage wishlistPage = new WishlistPage(driver);

        wishlistPage.navigateToShop();
    }
    public void verifyItemToAdd() {
    	WishlistPage ad=new WishlistPage(driver);
        ad.selectItemToAdd();
        ad.addToWishlist();
        ad.openWishlist();

        Assert.assertTrue(ad.isItemInWishlist(), "Item was not added to the wishlist");
    }
}
