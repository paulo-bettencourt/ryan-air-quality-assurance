@testAll
Feature: Card Details - Credit
  As a user i want to be able to see the details of my credit card

  Scenario: Card Details - Credit
    Given i am in login page
    Then want to change language
    And change language successfully
    Then i want to login with "luis.amorim" and "Password1*"
    And i logged in successfully
    Then i click on cards on the nav bar
    Then i select one credit card
    And i can see the credit card details