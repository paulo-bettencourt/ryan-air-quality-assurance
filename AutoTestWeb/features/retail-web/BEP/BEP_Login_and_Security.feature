@testAll
Feature: BEP - Login and Security
  As a user i want to be able to see a user's login and security tab

  Scenario: BEP - Login and Security
    Given i am in the BEP login page
    Then i want to login with "employee1" and "Password1*"
    Then i search for "ana.camara"
    And i click on the user first user
    Then i click on the login and security tab
    And i can see the login and security page