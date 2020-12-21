@testAll @ARD-11469
Feature: Business Language Switcher
  As a user i want to be able to change language in business

  Scenario: Change Language Business
    Given i am in the business login page
    And i change the language to english
    And change language successfully

  Scenario: Change Language Business in Dashboard
    Given i am in the business login page
    Then i want to login with "companyb1" and "Password1*"
    And i confirm i am in select context page
    Then i select the context "sa_companyB1"
    And i am on the business dashboard
    And i press to change language in dashboard
    And i confirm i am on the business dashboard in portuguese
