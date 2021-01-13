@testAll @ARD-11625 @ARD-11891 @ARD-11889 @ARD-11892 @ARD-11667 @ARD-11670
Feature: Business - Transactions

  Scenario: Business - Transactions Print
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in transactions page
    Then i select an account in transactions
    And i see and press the print button

  Scenario: Business - Transactions Filter
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in transactions page
    Then i select an account in transactions
    And i see and click the filter button

  Scenario: Business - Transactions Search
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in transactions page
    Then i select an account in transactions
    And i see and search the transactions

  Scenario: Business - Transactions Export to CSV
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in transactions page
    Then i select an account in transactions
    And i see and click the export to CSV button

  Scenario: Business - Transaction Details
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in transactions page
    Then i select an account in transactions
    Then i select a transaction and see details modal
