@Outpatient
Feature: Outpatient
  As a user
  I want to manage outpatient
  So that I need outpatient feature

  @View
  Scenario: View Outpatient List
    Given I am on Home Page
    When I click menu outpatient
    And I click sub menu outpatient list
    Then I am on outpatient list page

  Scenario: View Report OutPatient
    Given I am on Outpatient report Page
    When I click view report button
    Then I am validate report

  @Add
  Scenario Outline: Add Outpatient
    Given I am on Add Menu Outpatient
    When I input "<kodePasien>", "<namaPasien>", "<tanggalKontrol>", "<keluhan>", "<jenisPoli>", "<jadwalSesi>", "<namaDokter>", "<nomorAntrian>"
    And I click submit button
    Then I am validate "<respond>"
    Examples:
    |kodePasien|namaPasien|tanggalKontrol|keluhan|jenisPoli|jadwalSesi|namaDokter|nomorAntrian|respond|
    |          |hana      |tanggal       |sakit maag|poli  |sesi      |dokter    |1           |null   |
    |RM00026   |hana      |              |sakit maag|poli  |sesi      |dokter    |1           |null   |
    |RM00026   |hana      |tanggal       |sakit maag|      |sesi      |dokter    |1           |null   |
    |RM00026   |hana      |tanggal       |sakit maag|poli  |          |dokter    |1           |null   |
    |RM00026   |hana      |tanggal       |sakit maag|poli  |sesi      |          |1           |null   |


