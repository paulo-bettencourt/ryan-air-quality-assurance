@testAll
Feature: Account Details - Current Account
  As a user i want to be able to see my Current Account details

  Scenario: Current Account Details
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i can click on a current account
    And click account details tab
    And current account details are loaded