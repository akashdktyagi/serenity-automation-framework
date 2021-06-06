package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import starter.pageobjects.LoginPageObjects;

public class StepDefsLoginPage {

    @Managed
    WebDriver driver;

    @Steps
    LoginPageObjects loginPageObjects;

    @Given("I am on the landing page of the app")
    public void i_am_on_landing_page() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        Assert.assertEquals("No on the landing page",driver.getTitle(),"ParaBank | Welcome | Online Banking");
    }

    @Then("I am able to login in the app")
    public void i_am_able_to_login_in_the_app() {
        loginPageObjects.validateLoginIsSuccess();
    }

    @When("I enter username and password")
    public void i_enter_username_and_password() {
        loginPageObjects.enterUserNameAndPasswordAndClickSubmit("john","demo");
    }

}
