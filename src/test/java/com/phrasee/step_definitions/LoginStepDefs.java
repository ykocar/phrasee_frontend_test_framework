package com.phrasee.step_definitions;

import com.phrasee.pages.LoginPage;
import com.phrasee.utilities.BrowserUtils;
import com.phrasee.utilities.ConfigurationReader;
import com.phrasee.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the log-in page")
    public void theUserIsOnTheLogInPage() {

        Driver.get().get(ConfigurationReader.get("url"));

        BrowserUtils.waitFor(2);
    }

    //entries for positive scenario
    @When("the user enters the credentials")
    public void theUserEntersTheCredentials() {

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

    }

    @Then("the user should be able to login")
    public void theUserShouldBeAbleToLogin() {

        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("User Dashboard | Phrasee", actualTitle);
    }

    //entries for negative scenario
    @When("the user loged in using invalid or blank {string} {string}")
    public void theUserLogedInUsingInvalidOrBlank(String email2, String password2) {

        loginPage.login1(email2, password2);
    }

    @Then("the user should not be able to login with {string} {string}")
    public void theUserShouldNotBeAbleToLoginWith(String email2, String password2) {

        BrowserUtils.waitFor(3);

        if ((email2.contains(" ") && password2.contains("!jC8zICx^5a9")) ||
                (email2.contains("yasinkocar")) && password2.contains("!jC8zICx^5a9")) {
            String expectedEmailErrorMessage = "Please enter a valid email address";
            String actualEmailErrorMessage = loginPage.actualEmailErrorMessage.getText();

            Assert.assertEquals(expectedEmailErrorMessage, actualEmailErrorMessage);

        } else if ((password2.contains(" ") && email2.contains("yasinkocar@gmail.com"))) {

            String expectedPasswordErrorMessage = "Please enter a valid password";
            String actualPasswordErrorMessage = loginPage.actualPasswordErrorMessage.getText();

            Assert.assertEquals(expectedPasswordErrorMessage, actualPasswordErrorMessage);

        } else if ((email2.contains("yasinkocar@gmail.com") && (password2.contains("113dfdfdfg")))) {

            BrowserUtils.waitFor(2);
            String actualTitle = Driver.get().getTitle();
            Assert.assertEquals("Login | Phrasee", actualTitle);

        }

    }

}

