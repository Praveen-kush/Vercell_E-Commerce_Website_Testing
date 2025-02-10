package testCases;
import org.testng.annotations.Test;


import pageObjects.CheckoutPage;
import testBase.BaseClass;

public class CheckoutTest extends BaseClass{
	@Test
    public void testCheckoutProcess() {
	   CheckoutPage ct=new CheckoutPage(driver);
       ct.setcheckout();
	}
	public void testcheckoutbox() {
		CheckoutPage cb=new CheckoutPage(driver);
	    cb.setcheckoutbox();
	    cb.setCheckout1();

}
}