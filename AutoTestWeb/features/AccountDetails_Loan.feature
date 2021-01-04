@testAll
Feature: Account Details - Loan Account
  As a user i want to be able to see my Loan Account details

  Scenario: Loan Account Details
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "thiago.oliveira" and "Password1*"
    And i logged in successfully
    Then i can click on a "loans" account
    And click account details tab
    And Account details are loaded