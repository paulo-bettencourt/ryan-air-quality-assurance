@testAll @ARD-11465
Feature: Logout
  As a user i want to be able to logout

  Scenario: Business - Logout of the platform
    Given i am in the business login page
    Then i want to login with "companyb1" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_companyB1"
    And i am on the business dashboard
    And want to logout
    And logout successfully
