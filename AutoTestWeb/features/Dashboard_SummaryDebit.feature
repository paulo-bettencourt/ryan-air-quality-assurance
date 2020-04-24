@testAll
Feature: Dashboard - Summary of Debit Account
  As a user i want to be able to see the summary of Debit Account on the Dashboard

  Scenario: Load Dashboard - Summary of Debit Account
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i can click on a debit account
    And i am redirected to the transactions page
