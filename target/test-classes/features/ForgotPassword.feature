@ForgotPass
Feature: forgot password
  As a user
  I forget my password
  So that I change my password

  Scenario Outline: Forgot Password
    Given I am on the Forgot password page
    And I input email user
    When I input new "<password>" and "<confirm>" password
    And I click confirm button
    Then I validate change password "<respons>"
    Examples:
    |password|confirm|respons|
    |pass|word|incorrect pass|
    |password|password|success|
    |        |          |blank|