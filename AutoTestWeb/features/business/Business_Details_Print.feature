@testAll @ARD-11625
Feature: Business - Print Account Details

  Scenario: Business - I print account details
    Given i am in the business login page
    Then i want to login with "companyb1" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_companyB1"
    And i am on the business dashboard
    And i can view the accounts list view
    Then i click on the kebab button of the first account
    Then i click to see details on the kebab
    And i print the account details