@testAll
Feature: Dashboard - Summary of Savings Account
  As a user i want to be able to see the summary of Savings Account on the Dashboard

  Scenario: Load Dashboard - Summary of Savings Account
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    And i can see the savings account amount