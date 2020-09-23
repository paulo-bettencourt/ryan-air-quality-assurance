@testAll
Feature: Dashboard - Summary of Current Account
  As a user i want to be able to see the summary of Current Account on the Dashboard

  Scenario: Load Dashboard - Summary of Current Account
    Given i am in login page
    Then want to change language
    And change language successfully
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i can click on a current account
    And i am redirected to the Current transactions page
