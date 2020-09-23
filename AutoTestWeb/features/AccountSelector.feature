@testAll
Feature: Account Selector
  As a user i want to be able to change account on the transactions account selector and click on the Account details tab to see the Loan account details

  Scenario: Account Selector
    Given i am in login page
    Then want to change language
    And change language successfully
    Then i want to login with "luis.amorim" and "Password1*"
    And i logged in successfully
    Then i can click on a current account
    Then select loan account from account selector
    And click account details tab
    And loan account details are loaded