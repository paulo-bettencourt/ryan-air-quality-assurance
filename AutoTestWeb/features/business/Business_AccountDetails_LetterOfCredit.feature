@testAll @ARD-11905
Feature: Business - Account Details

  Scenario: Business - Letter of Credit Account Details
    Given i am in the business login page
    Then i want to login with "business.aa" and "Password1*"
    And i can view the accounts list view
    Then i click on the kebab menu of letter of credit account
    Then i click to see details on the letter of credit kebab
    Then business letter of credit account details are loaded
