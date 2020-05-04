@testAll
Feature: Account Details - Savings Account
  As a user i want to be able to see my Savings Account details

  Scenario: Savings Account Details
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i can click on a savings account
    And click account details tab
    And savings account details are loaded