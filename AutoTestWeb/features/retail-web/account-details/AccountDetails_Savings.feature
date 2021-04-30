@testAll
Feature: Account Details - Savings Account
  As a user i want to be able to see my Savings Account details

  Scenario: Savings Account Details
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "luis.amorim" and "Password1*"
    And i logged in successfully
    Then i can click on a "savings" account
    And click account details tab
    And Account details are loaded