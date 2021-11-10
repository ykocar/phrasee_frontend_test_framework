package com.phrasee.step_definitions;

import com.phrasee.pages.LanguageGenerationPage;
import com.phrasee.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LG_stepDefs {

    LanguageGenerationPage languageGenerationPage = new LanguageGenerationPage();

    @When("the user selects date for the email")
    public void theUserSelectsDateForTheEmail() {

        languageGenerationPage.dateCheckbox.click();

        languageGenerationPage.dateSelectBox.sendKeys("15 Nov 2021", Keys.ENTER);
        BrowserUtils.waitFor(2);

    }

    @And("the user selects campaign type")
    public void theUserSelectsCampaignType() {

        languageGenerationPage.campaignTypeCheckbox.click();

        for (WebElement option : languageGenerationPage.campaignTypeDropdwn) {
            System.out.println(option.getText());

            if (option.getText().contains("off")) {

                option.click();
            }
        }

    }

    @And("the user enters product name")
    public void theUserEntersProductName() {

        languageGenerationPage.productName.sendKeys("jackets");
    }

    @And("the user enters discount offered and chooses Yes before the discount")
    public void theUserEntersDiscountOfferedAndChoosesYesBeforeTheDiscount() {

        languageGenerationPage.discount.sendKeys("10");
        languageGenerationPage.upToBttn.click();
    }

    @And("the user selects specific category type")
    public void theUserSelectsSpecificCategoryType() {

        languageGenerationPage.specificCategoryCheckbox.click();

        for (WebElement option : languageGenerationPage.categoryTypeDropdwn) {
            System.out.println(option.getText());

            if (option.getText().contains("Sports")) {

                option.click();
            }
        }
    }

    @And("the user selects calendar event")
    public void theUserSelectsCalendarEvent() {

        languageGenerationPage.calendarEventCheckbox.click();

        for (WebElement option : languageGenerationPage.calendarEventDropdwn) {
            System.out.println(option.getText());

            if (option.getText().contains("Friday")) {

                option.click();

            }

        }
    }

    @And("the user selects offer ending option")
    public void theUserSelectsOfferEndingOption() {

        languageGenerationPage.offerEndsCheckbox.click();

        for (WebElement option : languageGenerationPage.offerEndsDropdwn) {
            System.out.println(option.getText());
            if (option.getText().contains("Other")) {

                option.click();

            }
        }

    }

    @And("the user selects offer ending time")
    public void theUserSelectsOfferEndingTime() {

        languageGenerationPage.endDateForOfferCheckbox.click();

        languageGenerationPage.endDateOfferSelectBox.sendKeys("30 Nov 2021", Keys.ENTER);
        BrowserUtils.waitFor(2);

    }

    @And("the user clicks Magic button")
    public void theUserClicksMagicButton() {

        languageGenerationPage.magicBttn.click();
        BrowserUtils.waitFor(5);
    }

    @Then("the user should see the Phrasee's set heading text")
    public void theUserShouldSeeThePhraseeSSetHeadingText() {

        String expectedPhraseeMessage = "Phrasee's optimal set for testing:";
        String actualPhraseeMessage = languageGenerationPage.phraseeMessage.getText();

        Assert.assertEquals(expectedPhraseeMessage, actualPhraseeMessage);
    }
}


