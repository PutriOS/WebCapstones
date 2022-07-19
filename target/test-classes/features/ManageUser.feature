@Outpatient
Feature: Outpatient

  @ManageNeg
  Scenario Outline: Manage User
    Given I am on Manage user page
    When I input "<namaUser>", "<email>", "<jenisKelamin>", "<role>", "<fasilitas>"
    And I click update button
    Then I am validating the "<responses>"
    Examples:
      |namaUser|email|jenisKelamin|role|fasilitas|responses|
      |den     |dennise124@holyhos.co.id|Female|role|fasilitas |length invalid|
#      |        |dennise124@holyhos.co.id|Female|role|fasilitas |name null|
      |dennise|                         |Female|role|fasilitas |email null|
      |dennise|dennise124@holyhos.co.id|       |role|fasilitas |gender null|

  @ManagePos
  Scenario: Manage User
    Given I am on Manage user page
    When I update user data
    And I click update button
    Then I am validating the element

  @Search
  Scenario: Search
    Given I am on Manage user page
    When I input search
    Then I am validate user
