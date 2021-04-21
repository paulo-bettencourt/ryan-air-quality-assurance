@testAll @ARD-13127
Feature: Business Bill Payments - Select Debit Account

  Scenario: Business Bill - Select Debit
    Given i am in the business login page
    And i change the language to english
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    Then i click on bill payments on the nav bar
    And i enter and confirm i am in bill payments page
    And search for the "102" entity on the search bar
    And i insert a reference "123456789"
    And i select " MARGIN ACCT CLIENT SALARY PAYMENTS " the debit account for bills
    Then i confirm the details of the selected account are displaying well, the name " MARGIN ACCT CLIENT SALARY PAYMENTS " and the account " 1001050029 "
