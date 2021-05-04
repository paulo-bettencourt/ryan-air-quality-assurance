@testAll
Feature: Self Enrolment
  As a user with no online account i want to be able to do my self enrolment

  Scenario Outline: Self Enrolment - Success
    Given i am in login page
    Then I click on the Register button
    And i choose a client number from the dropdown
    Then i insert "<clientID>" as a client number
    And i click the next button success
    And i am in the verification page

  @uxt
    Examples:
      | clientID | password |
      | 101314 | Password1* |

  Scenario Outline: Self Enrolment - Error
    Given i am in login page
    Then I click on the Register button
    And i choose a client number from the dropdown
    Then i insert "<clientID>" as a client number
    And next button is disabled on SE

  @uxt
    Examples:
      | clientID | password |
      | 12013 | Password1* |