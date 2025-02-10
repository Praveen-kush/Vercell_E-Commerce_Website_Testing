package testCases;


import org.testng.annotations.Test;

import pageObjects.SearchPage;
import testBase.BaseClass;

public class SearchTest extends BaseClass{
	@Test
    public void testSearchProduct() {
        SearchPage sp = new SearchPage(driver);
        sp.setsearchproduct("Shoes");
        sp.setSubmit();
        sp.setConfirmMSG();
    }
}

	



    