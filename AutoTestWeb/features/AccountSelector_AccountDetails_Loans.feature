@testAll
Feature: Account Selector and Loan Account Details
  As a user i want to be able to change account on the transactions account selector and click on the Account details tab to see the Loan account details

  Scenario: Account Selector & Details
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then select current account from dashboard
    Then select loan account from account selector
    And click account details tab
    And account details are loaded