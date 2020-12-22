@testAll @ARD-11626
Feature: Business - Account Details

  Scenario: Business - Debit Account Details
    Given i am in the business login page
    Then i want to login with "loan.debit.biz" and "Password1*"
    And i can view the accounts list view
    Then i click on the kebab menu of debit account
    Then i click to see details on the debit kebab
    Then business debit account details are loaded
