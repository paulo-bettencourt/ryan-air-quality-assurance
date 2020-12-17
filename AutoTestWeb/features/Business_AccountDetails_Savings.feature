@testAll @ARD-11629
Feature: Business - Account Details

  Scenario: Business - Savings Account Details
    Given i am in the business login page
    Then i want to login with "companyb1" and "Password1*"
    And i select the context "sa_companyB1"
    And i can view the accounts list view
    Then i click on the kebab menu of savings account
    Then i click to see details on the kebab
    Then business savings account details are loaded
