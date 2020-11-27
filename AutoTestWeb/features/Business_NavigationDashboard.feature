@testAll @ARD-11467  @ARD-11463
Feature: Business - Dashboard Navigation bar

  Scenario: Business - Navigation Bar
    Given i am in the business login page
    Then i want to login with "companyb1" and "Password1*"
    And i select the context "sa_companyB1"
    And i am on the business dashboard
    And i can see the navigation bar

  Scenario: Business - View name and context
    Given i am in the business login page
    Then i want to login with "companyb1" and "Password1*"
    And i select the context "sa_companyB1"
    And i am on the business dashboard
    And i can view username "User1" and context "sa_companyB1"
