@testAll
Feature: Transfer - SBA Accounts
  As a user i want to be able to do transfers for another SBA account

  Scenario: Transfer Savings account to Jane Doe contact
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i can click on new transfer on the quick action button
    And i am redirected to the new transfer page
    #    Then i select a savings account on the from selector #Line commented because the account is selected by default
    And i select "Test123" on the selector
    And i insert "73" on the amount input
    Then i click on next button
    And i am redirected to the review page

  Scenario: Transfer Savings account to wrong BBAN
    Given i am in login page
    Then want to change language
    And change language successfully
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i can click on new transfer on the quick action button
    And i am redirected to the new transfer page
    #    Then i select a savings account on the from selector #Line commented because the account is selected by default
    And i insert a recipients name "abc"
    Then i insert a wrong BBAN "5555555555"
    And i insert "73" on the amount input
    Then i click on next button
    And i am redirected to the review page
    And a error message appears