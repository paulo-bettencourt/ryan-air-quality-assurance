@testAll
Feature: Dashboard - Summary of Current Account
  As a user i want to be able to see the summary of Current Account on the Dashboard

  Scenario: Load Dashboard - Summary of Current Account
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then Dashboard is loaded