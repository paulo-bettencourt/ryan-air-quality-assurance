@testAll
Feature: Business Transfer - Own Accounts
  As a user i want to be able to do transfers between my own SBA account

  Scenario: Business Transfer Savings account to Current account
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in transfers page
    Then i enter a beneficiary name "own account" and account "1002483581"
    And i enter the amount "100" to transfer
    And i see and click the continue button
    And i confirm the transfer

  Scenario: Business Transfer Savings account to Current account - Same Bank - Own Account
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in transfers page
    Then i enter a beneficiary name "own account" and account "1002483581"
    And i enter the amount "100" to transfer
    And i see and click the continue button
    And i confirm the transfer
