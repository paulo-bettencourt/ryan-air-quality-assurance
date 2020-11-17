@testAll @ARD-11464
Feature: Business - Select Context

  Scenario: Business - Select Context
    Given i am in the business login page
    Then want to change language
    And change language successfully
    Then i want to login with "companyb1" and "Password1*"
    And i confirm i am in select context page
    Then i select the context "sa_companyB1"
