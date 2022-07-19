@Home
Feature: Home Page
  As a user
  I want to see my home
  So that I need home page

  @Change
  Scenario Outline: Change Password
    Given I am on Home Page
    And I click menu change password
    When I input new change "<passwords>"
    Then I validate "<response>" change password
    Examples:
    |passwords|response|
    |pp       |invalid length|
    |         |blank         |

