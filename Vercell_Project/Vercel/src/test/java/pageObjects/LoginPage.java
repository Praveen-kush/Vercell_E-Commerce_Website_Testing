package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//input[@placeholder='example@gmail.com']")
WebElement txtEmail;

@FindBy(xpath="//input[@placeholder='**********']")
WebElement txtPassword;

@FindBy(xpath="//button[@class='login__button']")
WebElement btnLogin;


public void setEmail(String email) {
	txtEmail.sendKeys(email);
}

public void setPassword(String pwd) {
	txtPassword.sendKeys(pwd);
}

public void setLogin() {
	btnLogin.click();
}

}

