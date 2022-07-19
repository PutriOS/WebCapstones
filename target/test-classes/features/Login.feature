Feature: Login
  As a user
  I want to login
  So that I can access my homepage

  @Login
  Scenario Outline: Login scenario
    Given I am on the Login page
    When I input "<email>" and "<password>"
    And click login button
    Then I validate "<response>"
    Examples:
    |email|password|response|
    |alsyadahmad@holyhos.co.id|password|berhasil|
    |rimurutempest@holyhos.co.id|password|berhasil|
    |priscillahalim@holyhos.co.id|password|berhasil|
    |                            |password|email null|
    |alsyadahmad@holyhos.co.id   |        |password null|
    |                            |        |null         |
    |alsyadahmad@holyhos.co.id   |qq      |length invalid|

