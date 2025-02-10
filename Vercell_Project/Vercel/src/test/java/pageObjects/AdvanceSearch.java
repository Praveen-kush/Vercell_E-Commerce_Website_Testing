package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvanceSearch extends BasePage{
	    public AdvanceSearch(WebDriver driver) {
	        super(driver);
	    }
	    @FindBy(xpath="//a[normalize-space()='Home']")
	    WebElement Home;
	    
	    @FindBy(xpath="//a[normalize-space()='Shop']")
	    WebElement Shop;
	    
	    @FindBy(xpath="//a[contains(@href,'/category/men')][normalize-space()='Men']")
	    WebElement Men;
	    
	    @FindBy(xpath="//a[contains(@href,'/category/women')][normalize-space()='Women']")
	    WebElement Women;
	    
	    @FindBy(xpath="//a[contains(@href,'/category/kids')][normalize-space()='Kids']")
	    WebElement Kids;
	    
	    public void sethome() {
	    	Home.click();
	    }
	    
	    public void setshop() {
	    	Shop.click();
	    }
	    
	    public void setmen() {
	    	Men.click();
	    }
	    
	    public void setwomen() {
	    	Women.click();
	    }
	    
	    public void setkids() {
	    	Kids.click();
	    }

}
