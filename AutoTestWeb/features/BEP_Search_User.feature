@testAll
Feature: BEP - Search User
  As a user i want to be able to search for a user on the bank employee portal

  Scenario: BEP - Search User
    Given i am in the BEP login page
    Then i want to login with "employee1" and "Password1*"
    Then i search for "ana.camara"
    And i click on the user first user