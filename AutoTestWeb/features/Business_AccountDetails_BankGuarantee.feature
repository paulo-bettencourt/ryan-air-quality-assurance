@testAll @ARD-11631
Feature: Business - Account Details

  Scenario: Business - Bank Guarantee Account Details
    Given i am in the business login page
    Then i want to login with "business.aa" and "Password1*"
    And i can view the accounts list view
    Then i click on the kebab menu of bank guarantee account
    Then i click to see details on the bank guarantee kebab
    Then business bank guarantee account details are loaded
