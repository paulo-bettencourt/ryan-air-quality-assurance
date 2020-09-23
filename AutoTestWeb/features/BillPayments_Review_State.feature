@testAll
Feature: Bill Payments - Review State Payment
  As a user i want to be able to see the review page, after I fill in the bill payment form

  Scenario: Review Page with Configurable State Payment
    Given i am in login page
    Then want to change language
    And change language successfully
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i click on bill payments on the nav bar
    And search for the "808" entity on the search bar
    Then I select an account
    And i insert a reference
    Then i select an amount
    And i am able to click on Next button
    Then i am on the review page

  Scenario: Review Page with Standard State Payment
    Given i am in login page
    Then want to change language
    And change language successfully
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i click on bill payments on the nav bar
    And search for the "623" entity on the search bar
    Then I select an account for state
    And i insert a reference
    Then i select an amount (standard)
    And i am able to click on Next button (standard)
    Then i am on the review page