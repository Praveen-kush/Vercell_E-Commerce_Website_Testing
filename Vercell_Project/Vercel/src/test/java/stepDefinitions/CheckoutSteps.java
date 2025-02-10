package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageObjects.CheckoutPage;


public class CheckoutSteps {
    WebDriver driver;
    CheckoutPage checkoutPage;



    @Given("User has items in the cart")
    public void user_has_items_in_the_cart() {
        driver.get("https://luni-interface-029.vercel.app/cart");
    }

    @When("User clicks on the checkout button")
    public void user_clicks_on_the_checkout_button() {
        checkoutPage.setcheckout();
    }

    @When("User selects the checkout box")
    public void user_selects_the_checkout_box() {
        checkoutPage.setcheckoutbox();
    }

    @Then("User should be redirected to the checkout page")
    public void user_should_be_redirected_to_the_checkout_page() {
        // Validate checkout page redirection
    }
}
