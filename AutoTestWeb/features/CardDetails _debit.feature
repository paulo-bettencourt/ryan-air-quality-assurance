@testAll
Feature: Card Details - Debit
  As a user i want to be able to see the details of my debit card

  Scenario: Card Details - Debit
    Given i am in login page
    Then want to change language
    And change language successfully
    Then i want to login with "ana.camara" and "Password1*"
    And i logged in successfully
    Then i click on cards on the nav bar
    Then i select one debit card
    And i can see the debit card details