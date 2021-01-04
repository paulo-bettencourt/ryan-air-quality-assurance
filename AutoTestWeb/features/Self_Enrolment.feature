@testAll
Feature: Self Enrolment
  As a user with no online account i want to be able to do my self enrolment

  Scenario: Self Enrolment - Success
    Given i am in login page
    Then I click on the Register button
    And i choose a client number from the dropdown
    Then i insert "101314" as a client number
    And i click the next button success
    And i am in the verification page

  Scenario: Self Enrolment - Error
    Given i am in login page
    Then I click on the Register button
    And i choose a client number from the dropdown
    Then i insert "12013" as a client number
    And next button is disabled on SE