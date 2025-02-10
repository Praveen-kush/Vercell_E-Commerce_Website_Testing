package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;


public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;



    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver.get("https://luni-interface-029.vercel.app/login");
    }

    @When("User enters valid email {string} and password {string}")
    public void user_enters_valid_email_and_password(String email, String password) {
        loginPage.setEmail(email);
        loginPage.setPassword(password);
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.setLogin();
    }

    @Then("User should be redirected to the home page")
    public void user_should_be_redirected_to_the_home_page() {
        Assert.assertTrue(driver.getTitle().contains("Home"));
    }
}
