@vip
Feature: Setup for creating a campaign

  Scenario: Setup and Language Generation
    Given the user is on the main page
    When the user clicks Create new campaign button
    And user select Email tab
    And user selects a project
    And user enters the required info for the campaign
    And the user clicks next button
    Then the user should see the completed sign for the Setup

    When the user selects date for the email
    And the user selects campaign type
    And the user enters product name
    And the user enters discount offered and chooses Yes before the discount
    And the user selects specific category type
    And the user selects calendar event
    And the user selects offer ending option
    And the user selects offer ending time
    And the user clicks Magic button
    Then the user should see the Phrasee's set heading text

