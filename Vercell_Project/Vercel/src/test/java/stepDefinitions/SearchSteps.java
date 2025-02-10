package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SearchPage;

public class SearchSteps {
    WebDriver driver;
    SearchPage searchPage;

 

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        driver.get("https://luni-interface-029.vercel.app/");
    }

    @When("User enters {string} in the search box")
    public void user_enters_in_the_search_box(String searchQuery) {
        searchPage.setsearchproduct(searchQuery);
    }

    @When("User clicks the search button")
    public void user_clicks_the_search_button() {
        searchPage.setSubmit();
    }

    @Then("A message {string} should be displayed")
    public void a_message_should_be_displayed(String expectedMessage) {
        Assert.assertTrue(searchPage.setConfirmMSG());
    }
}
