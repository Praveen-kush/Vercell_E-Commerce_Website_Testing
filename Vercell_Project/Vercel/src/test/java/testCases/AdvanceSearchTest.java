package testCases;

import org.testng.annotations.Test;

import pageObjects.AdvanceSearch;
import testBase.BaseClass;

public class AdvanceSearchTest extends BaseClass {
	@Test
	public void verify_advancesearch() {
		AdvanceSearch as=new AdvanceSearch(driver);
		as.sethome();
		as.setshop();
		as.setmen();
		as.setwomen();
		as.setkids();
	}
	

		
	
}
