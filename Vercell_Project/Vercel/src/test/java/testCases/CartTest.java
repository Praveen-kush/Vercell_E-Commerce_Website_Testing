package testCases;

import org.testng.annotations.Test;

import pageObjects.CartPage;
import testBase.BaseClass;

public class CartTest extends BaseClass{
	@Test
	public void verify_cart_page() {
		CartPage cp=new CartPage(driver);
		cp.setshopnow();
	}	
	public void verify_product() {
		CartPage pd=new CartPage(driver);
		pd.setshoes();
		pd.setaddToBag();

	}

}
