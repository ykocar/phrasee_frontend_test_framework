package com.phrasee.step_definitions;

import com.phrasee.pages.CampaignPage;
import com.phrasee.pages.DashboardPage;
import com.phrasee.pages.LanguageGenerationPage;
import com.phrasee.pages.LoginPage;
import com.phrasee.utilities.BrowserUtils;
import com.phrasee.utilities.ConfigurationReader;
import com.phrasee.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SetupStepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    CampaignPage campaignPage = new CampaignPage();

    @Given("the user is on the main page")
    public void theUserIsOnTheMainPage() {

        Driver.get().get(ConfigurationReader.get("url"));

        BrowserUtils.waitFor(2);

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

    }

    @When("the user clicks Create new campaign button")
    public void theUserClicksCreateNewCampaignButton() {

        dashboardPage.newCampaignBttn.click();
        BrowserUtils.waitFor(2);
    }

    @And("user select Email tab")
    public void userSelectEmailTab() {
        BrowserUtils.waitFor(2);
        campaignPage.emailtBttn.click();

    }

    @And("user selects a project")
    public void userSelectsAProject() {

        campaignPage.selectProjectBttn.click();
        campaignPage.selectProject.click();
    }

    @And("user enters the required info for the campaign")
    public void userEntersTheRequiredInfoForTheCampaign() {

        campaignPage.campaignName.sendKeys("test");
        campaignPage.controlSubjectLine.sendKeys("human line");
        campaignPage.audienceSize.sendKeys("500000");
        campaignPage.avgOpenRate.sendKeys("10");
    }

    @And("the user clicks next button")
    public void theUserClicksNextButton() {

        campaignPage.nextBttn.click();

        BrowserUtils.waitFor(3);
    }

    @Then("the user should see the completed sign for the Setup")
    public void theUserShouldSeeTheCompletedSignForTheSetup() {

        Assert.assertTrue(new LanguageGenerationPage().completeIcon.isDisplayed());


    }


}

