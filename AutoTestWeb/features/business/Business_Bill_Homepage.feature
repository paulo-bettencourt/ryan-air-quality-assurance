@testAll @ARD-13125

Feature: Business - Bill Payments Homepage

  Scenario: Business - Bill Payments - Homepage

    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in bill payments page