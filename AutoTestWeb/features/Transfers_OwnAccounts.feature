@testAll
Feature: Transfer - Own Accounts
  As a user i want to be able to do transfers between my own SBA account

  Scenario: Transfer Savings account to Current account
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i can click on new transfer on the quick action button
    And i am redirected to the new transfer page
    #    Then i select a savings account on the from selector #Line commented because the account is selected by default
    And i select a current account on the to selector
    And i insert "1" on the amount input
    Then i click on next button
    And i am redirected to the review page