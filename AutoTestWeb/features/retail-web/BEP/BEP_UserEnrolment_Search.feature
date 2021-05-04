@testAll
Feature: BEP - New User Enrolment - Search
  As a user i want to be able to search for a new user to enrol

  Scenario Outline: BEP -  New User Enrolment - Search
    Given i am in the BEP login page
    Then i want to login with "<username>" and "<password>"
    Then i click on the User Enrolment menu
    And i click on the dropdown and select Client Number
    Then i insert the client number "<clientID>"
    Then Click on the Find Customer button
    And i click on the customer
    And i click on the cancel button

  @uxt
    Examples:
      | username | password | clientID |
      | employee1 | Password1* | 298731 |