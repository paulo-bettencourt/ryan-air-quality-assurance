@testAll @ARD-11628
Feature: Business - Account Details

  Scenario: Business - Loan Account Details
    Given i am in the business login page
    Then i want to login with "loan.debit.biz" and "Password1*"
    And i can view the accounts list view
    Then i click on the kebab menu of loan account
    Then i click to see details on the loan kebab
    Then business loan account details are loaded
