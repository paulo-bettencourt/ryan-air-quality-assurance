@testAll
Feature: BEP - Audit
  As a user i want to be able to search for contacts, transfers, and bill payments on BEP audit menu

  Scenario: BEP - Audit - Contacts
    Given i am in the BEP login page
    Then i want to login with "employee1" and "Password1*"
    Then i click on the Audit menu
    And i click on My Categories dropdown
    Then i select Contacts option
    And i click on the continue button

  Scenario: BEP - Audit - Transfers
    Given i am in the BEP login page
    Then i want to login with "employee1" and "Password1*"
    Then i click on the Audit menu
    And i click on My Categories dropdown
    Then i select Payments option
    And i select Payments on Type dropdown
    And i click on the continue button

  Scenario: BEP - Audit - Bill Payments
    Given i am in the BEP login page
    Then i want to login with "employee1" and "Password1*"
    Then i click on the Audit menu
    And i click on My Categories dropdown
    Then i select Payments option
    And i select Bill Payments on Type dropdown
    And i click on the continue button