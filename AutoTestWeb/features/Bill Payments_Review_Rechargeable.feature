@testAll
Feature: Bill Payments - Review Rechargeable Payment
  As a user i want to be able to see the review page, after I fill in the bill payment form

  Scenario: Review Page with Rechargeable Payment
    Given i am in login page
    Then want to change language
    And change language successfully
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i click on bill payments on the nav bar
    And search for the "103" entity on the search bar
    Then I select an account for Rechargeable
    And i insert a reference
    Then i select an amount
    And i am able to click on Next button for Reference
    Then i am on the review page