@testAll @retail
Feature: Bill Payments - Review Rechargeable Payment
  As a user i want to be able to see the review page, after I fill in the bill payment form

  Scenario Outline: Review Page with Rechargeable Payment
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully
    Then i click on bill payments on the nav bar
    And search for the "<entity>" entity on the search bar
#    Then I select an account for Rechargeable #Line commented because the account is select by default
    And i insert a reference "<reference>"
    Then i select an amount rechargeable
    And i am able to click on Next button for Rechargeable
    Then i am on the review page


    @uxt
    Examples:
      | username | password | entity | reference |
      | luis.amorim | Password1* | 103 | 123456789|