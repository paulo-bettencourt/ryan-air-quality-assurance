@testAll @ARD-11913
Feature: Business - Account Details

  Scenario: Business - Documentary Collection Account Details
    Given i am in the business login page
    Then i want to login with "patricia.company" and "Password1*"
    And i can view the accounts list view
    Then i click on the kebab menu of documentary collection account
    Then i click to see details on the documentary collection kebab
    Then business documentary collection account details are loaded
