@testAll
Feature: Business Transfer - Own Accounts
  As a user i want to be able to do transfers between my own SBA account

  Scenario: Business Transfer Savings account to Current account
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i select the context "sa_denise.silva" for portuguese user
    And i logged in successfully
    Then i can click on new transfer on the quick action button
    And i am redirected to the new transfer page
    Then i select a savings account on the from selector
    And i select a current account on the to selector
    And i insert "1" on the amount input
    Then i click on next button
    And i am redirected to the review page