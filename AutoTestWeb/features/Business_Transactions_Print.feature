@testAll @ARD-11625
Feature: Business - Transactions Print

  Scenario: Business - Transactions Print
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in transactions page
    Then i select an account in transactions
    And i see and press the print button
