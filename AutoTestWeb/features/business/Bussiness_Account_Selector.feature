@testAll @ARD-11893
Feature: Business - Transactions Account Selector

  Scenario: Business - Transactions Account Selector
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in transactions page
    Then i select an account in transactions
