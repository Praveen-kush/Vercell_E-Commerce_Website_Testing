package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageObjects.CartPage;


public class CartSteps {
    WebDriver driver;
    CartPage cartPage;


    @Given("User is on the shop page")
    public void user_is_on_the_shop_page() {
        driver.get("https://luni-interface-029.vercel.app/shop");
    }

    @When("User selects a product")
    public void user_selects_a_product() {
        cartPage.setshoes();
    }

    @When("User clicks \"ADD TO BAG\"")
    public void user_clicks_add_to_bag() {
        cartPage.setaddToBag();
    }

    @Then("The product should be added to the cart")
    public void the_product_should_be_added_to_the_cart() {
        // Validate cart update
    }
}
