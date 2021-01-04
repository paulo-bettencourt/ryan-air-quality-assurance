@testAll
Feature: Account Details - Current Account
  As a user i want to be able to see my Current Account details

  Scenario: Current Account Details
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "luis.amorim" and "Password1*"
    And i logged in successfully
    Then i can click on a "current" account
    And click account details tab
    And Account details are loaded