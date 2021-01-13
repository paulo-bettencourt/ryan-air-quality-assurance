@testAll
Feature: Business Bill Payments - Review State Payment
  As a user i want to be able to see the review page, after I fill in the bill payment form

  Scenario: Business Review Page with State Payment
    Given i am in the business login page
    And i change the language to english
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    Then i click on bill payments on the nav bar
    And in business search for the "623" entity on the search bar
#    Then I select an account for Reference #Line commented because the account is select by default
    And i insert a reference "123456789"
    Then i insert an amount "123" for Reference
    And i am able to click on Next button for Reference
    Then i am on the review page