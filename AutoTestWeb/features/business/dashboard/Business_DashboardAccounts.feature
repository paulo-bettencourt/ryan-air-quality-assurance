@testAll @ARD-11470 @ARD-11471
Feature: Business - Dashboard Change Context

  Scenario: Business - Accounts List View
    Given i am in the business login page
    Then i want to login with "companyb1" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_companyB1"
    And i am on the business dashboard
    And i can view the accounts list view

  Scenario: Business - Accounts Card View
    Given i am in the business login page
    Then i want to login with "companyb1" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_companyB1"
    And i am on the business dashboard
    And i can view the accounts cards view
