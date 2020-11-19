@testAll @ARD-11464
Feature: Business - Dashboard Change Context

  Scenario: Business - Change Context
    Given i am in the business login page
    Then i want to login with "companyb1" and "Password1*"
    And i select the context "sa_companyB1"
    And i am on the business dashboard
    And i want to change context
    And i select the context "sa_companyB1_2"
    And i change context successfully "User1"
