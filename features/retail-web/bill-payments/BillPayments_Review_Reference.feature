@testAll @retail
Feature: Bill Payments - Review Reference Payment
  As a user i want to be able to see the review page, after I fill in the bill payment form

  Scenario Outline: Review Page with Reference Payment
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully
    Then i click on bill payments on the nav bar
    And search for the "<entity>" entity on the search bar
#    Then I select an account for Reference #Line commented because the account is select by default
    And i insert a reference "<reference>"
    Then i insert an amount "<amount>" for Reference
    And i am able to click on Next button for Reference
    Then i am on the review page

  @uxt
    Examples:
      | username | password | entity | reference | amount |
      | luis.amorim | Password1* | 102 | 123456789 | 123 |