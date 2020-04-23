@testAll
Feature: Dashboard - Summary of Credit Account
  As a user i want to be able to see the summary of Credit Account on the Dashboard

  Scenario: Load Dashboard - Summary of Credit Account
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    And i can see the Credit account amount