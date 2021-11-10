$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Users should be able to login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@vip"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the log-in page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.theUserIsOnTheLogInPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User log-in with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@vip"
    },
    {
      "name": "@Positive"
    }
  ]
});
formatter.step({
  "name": "the user enters the credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.theUserEntersTheCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.theUserShouldBeAbleToLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User log-in with invalid or blank credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "name": "the user loged in using invalid or blank \"\u003cemail\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should not be able to login with \"\u003cemail\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "",
        "!jC8zICx^5a9"
      ]
    },
    {
      "cells": [
        "yasinkocar@gmail.com",
        ""
      ]
    },
    {
      "cells": [
        "yasinkocar",
        "!jC8zICx^5a9"
      ]
    },
    {
      "cells": [
        "yasinkocar@gmail.com",
        "113dfdfdfg"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the log-in page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.theUserIsOnTheLogInPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User log-in with invalid or blank credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@vip"
    },
    {
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "name": "the user loged in using invalid or blank \"\" \"!jC8zICx^5a9\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.theUserLogedInUsingInvalidOrBlank(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not be able to login with \"\" \"!jC8zICx^5a9\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.theUserShouldNotBeAbleToLoginWith(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the log-in page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.theUserIsOnTheLogInPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User log-in with invalid or blank credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@vip"
    },
    {
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "name": "the user loged in using invalid or blank \"yasinkocar@gmail.com\" \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.theUserLogedInUsingInvalidOrBlank(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not be able to login with \"yasinkocar@gmail.com\" \"\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.theUserShouldNotBeAbleToLoginWith(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the log-in page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.theUserIsOnTheLogInPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User log-in with invalid or blank credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@vip"
    },
    {
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "name": "the user loged in using invalid or blank \"yasinkocar\" \"!jC8zICx^5a9\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.theUserLogedInUsingInvalidOrBlank(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not be able to login with \"yasinkocar\" \"!jC8zICx^5a9\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.theUserShouldNotBeAbleToLoginWith(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the log-in page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.theUserIsOnTheLogInPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User log-in with invalid or blank credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@vip"
    },
    {
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "name": "the user loged in using invalid or blank \"yasinkocar@gmail.com\" \"113dfdfdfg\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.theUserLogedInUsingInvalidOrBlank(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not be able to login with \"yasinkocar@gmail.com\" \"113dfdfdfg\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.theUserShouldNotBeAbleToLoginWith(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Setup_and_languageGeneration.feature");
formatter.feature({
  "name": "Setup for creating a campaign",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@vip"
    }
  ]
});
formatter.scenario({
  "name": "Setup and Language Generation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@vip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "SetupStepDefs.theUserIsOnTheMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Create new campaign button",
  "keyword": "When "
});
formatter.match({
  "location": "SetupStepDefs.theUserClicksCreateNewCampaignButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select Email tab",
  "keyword": "And "
});
formatter.match({
  "location": "SetupStepDefs.userSelectEmailTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects a project",
  "keyword": "And "
});
formatter.match({
  "location": "SetupStepDefs.userSelectsAProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the required info for the campaign",
  "keyword": "And "
});
formatter.match({
  "location": "SetupStepDefs.userEntersTheRequiredInfoForTheCampaign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks next button",
  "keyword": "And "
});
formatter.match({
  "location": "SetupStepDefs.theUserClicksNextButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the completed sign for the Setup",
  "keyword": "Then "
});
formatter.match({
  "location": "SetupStepDefs.theUserShouldSeeTheCompletedSignForTheSetup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects date for the email",
  "keyword": "When "
});
formatter.match({
  "location": "LG_stepDefs.theUserSelectsDateForTheEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects campaign type",
  "keyword": "And "
});
formatter.match({
  "location": "LG_stepDefs.theUserSelectsCampaignType()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters product name",
  "keyword": "And "
});
formatter.match({
  "location": "LG_stepDefs.theUserEntersProductName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters discount offered and chooses Yes before the discount",
  "keyword": "And "
});
formatter.match({
  "location": "LG_stepDefs.theUserEntersDiscountOfferedAndChoosesYesBeforeTheDiscount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects specific category type",
  "keyword": "And "
});
formatter.match({
  "location": "LG_stepDefs.theUserSelectsSpecificCategoryType()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects calendar event",
  "keyword": "And "
});
formatter.match({
  "location": "LG_stepDefs.theUserSelectsCalendarEvent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects offer ending option",
  "keyword": "And "
});
formatter.match({
  "location": "LG_stepDefs.theUserSelectsOfferEndingOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects offer ending time",
  "keyword": "And "
});
formatter.match({
  "location": "LG_stepDefs.theUserSelectsOfferEndingTime()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Magic button",
  "keyword": "And "
});
formatter.match({
  "location": "LG_stepDefs.theUserClicksMagicButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the Phrasee\u0027s set heading text",
  "keyword": "Then "
});
formatter.match({
  "location": "LG_stepDefs.theUserShouldSeeThePhraseeSSetHeadingText()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});