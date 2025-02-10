package testCases;


import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;
import pageObjects.HomePage;

//import pageObjects.BasePage;
public class LoginTest extends BaseClass {
	
	@Test
	public void verify_login_account()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		
		LoginPage accpage=new LoginPage(driver);
		accpage.setEmail("praveenkushwaha0468@gmail.com");
		accpage.setPassword("xyz123456");
		accpage.setLogin();
		
		
	}

}
