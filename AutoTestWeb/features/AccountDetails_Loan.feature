@testAll
Feature: Account Details - Loan Account
  As a user i want to be able to see my Loan Account details

  Scenario: Loan Account Details
    Given i am in login page
    Then i want to login with "luis.amorim" and "Password1*"
    And i logged in successfully
    Then i can click on a loans account
    And click account details tab
    And loan account details are loaded