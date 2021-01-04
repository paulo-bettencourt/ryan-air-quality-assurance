@testAll @ARD-12117 @ARD-11630 @business
Feature: Business - Account Details

  Scenario: Business - Account Details - Account Selector
    Given i am in the business login page
    Then i want to login with "companyb1" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_companyB1"
    And i am on the business dashboard
    And i can view the accounts list view
    Then i click on the kebab button of the first account
    Then i click to see details on the kebab
    Then i can view account selector

  Scenario: Business - Current Account Details
    Given i am in the business login page
    Then i want to login with "patricia.company" and "Password1*"
    And i can view the accounts list view
    Then i click on the kebab button of the first account
    Then i click to see details on the kebab
    Then business current account details are loaded
