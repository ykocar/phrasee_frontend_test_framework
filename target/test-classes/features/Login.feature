@vip
Feature: Users should be able to login

  Background:
    Given the user is on the log-in page

  @Positive
  Scenario: User log-in with valid credentials
    When the user enters the credentials
    Then the user should be able to login

  @Negative
  Scenario Outline: User log-in with invalid or blank credentials
    When the user loged in using invalid or blank "<email>" "<password>"
    Then the user should not be able to login with "<email>" "<password>"

    Examples:
      | email                      | password     |
      |                            | !jC8zICx^5a9 |
      | yasinkocar@gmail.com       |              |
      | yasinkocar                 | !jC8zICx^5a9 |
      | yasinkocar@gmail.com       | 113dfdfdfg   |



