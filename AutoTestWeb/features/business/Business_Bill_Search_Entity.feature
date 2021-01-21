@testAll @ARD-13126
Feature: Bill Payments - Search Entity
  As a user i want to be able to search for the entities to pay my bills

  Scenario: Bill Payments - Search Entity
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in bill payments page
    And in business search for the "602" entity on the search bar
    Then i confirm i see "602 - EPAL Pagamentos(QUAL)" after inserting the entity number
