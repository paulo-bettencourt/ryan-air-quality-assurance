@testAll
Feature: BEP - Manage user info
  As a user i want to be able to manage another user email and phone number

  Scenario: BEP - Manage user info
    Given i am in the BEP login page
    Then i want to login with "employee1" and "Password1*"
    Then i search for "ana.camara"
    And i click on the user first user
    Then i try to change the email and cancel
    And try to change the phone number and cancel