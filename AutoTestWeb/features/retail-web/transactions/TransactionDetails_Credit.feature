@testAll
Feature: Transaction Details - Credit Account
  As a user i want to be able to see my Credit Account transaction details

  Scenario: Credit Transaction Details
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i can click on a "credit" account
    And i am redirected to the transactions page
    Then i can click on the first transaction
    And i can see the transaction details