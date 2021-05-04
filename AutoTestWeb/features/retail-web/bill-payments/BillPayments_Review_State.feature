@testAll
Feature: Bill Payments - Review State Payment
  As a user i want to be able to see the review page, after I fill in the bill payment form

  Scenario Outline: Review Page with Configurable State Payment
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully
    Then i click on bill payments on the nav bar
    And search for the "<entity>" entity on the search bar
#    Then I select an account #Line commented because the account is select by default
    And i insert a reference "<reference>"
    Then i select an amount for State Configurable
    And i am able to click on Next button for State Configurable
    Then i am on the review page

  @uxt
    Examples:
      | username | password | entity | reference |
      | real1 | Password1* | 808 | 123456789 |

  Scenario Outline: Review Page with Standard State Payment
    Given i am in login page
    Then want to change language
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully
    Then i click on bill payments on the nav bar
    And search for the "<entity>" entity on the search bar
#    Then I select an account for state   #Line commented because the account is select by default
    And i insert a reference "<reference>"
    Then i insert an amount "<amount>" for State Standard
    And i am able to click on Next button for State Standard
    Then i am on the review page

  @uxt
    Examples:
      | username | password | entity | reference | amount |
      | real1 | Password1* | 623 | 123456789 | 123 |