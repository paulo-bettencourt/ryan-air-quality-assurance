@testAll

Feature: Business - Bill Payments Page

  Scenario: Business - Bill Payments - Navigation
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in bill payments page


  Scenario: Review Page with Rechargeable Payment - Business
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i click on bill payments on the nav bar
    And search for the "103" entity on the search bar
    And i insert a reference "123456789"
    Then i select an amount rechargeable
    And i am able to click on Next button for Rechargeable
    Then i am on the review page

  Scenario: Review Page with Reference Payment
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in bill payments page
    And search for the "102" entity on the search bar
    And i insert a reference "123456789"
    Then i insert an amount "123" for Reference
    And i am able to click on Next button for Reference
    Then i am on the review page

  Scenario: Business Review Page with State Payment
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in bill payments page
    And in business search for the "623" entity on the search bar
    And i insert a reference "123456789"
    Then i insert an amount "123" for Reference
    And i am able to click on Next button for Reference
    Then i am on the review page
