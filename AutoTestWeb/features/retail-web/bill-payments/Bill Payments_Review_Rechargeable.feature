@testAll
Feature: Bill Payments - Review Rechargeable Payment
  As a user i want to be able to see the review page, after I fill in the bill payment form

  Scenario: Review Page with Rechargeable Payment
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i click on bill payments on the nav bar
    And search for the "103" entity on the search bar
#    Then I select an account for Rechargeable #Line commented because the account is select by default
    And i insert a reference "123456789"
    Then i select an amount rechargeable
    And i am able to click on Next button for Rechargeable
    Then i am on the review page