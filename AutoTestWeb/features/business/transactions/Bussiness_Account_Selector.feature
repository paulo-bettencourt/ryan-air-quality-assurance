@testAll @ARD-11893
Feature: Business - Transactions Account Selector

  Scenario Outline: Business - Transactions Account Selector
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i enter and confirm i am in transactions page
    Then i select an account in transactions

  #not working on test, SA selection error that will be fixed when UXT is imported to TEST
  @test-[skipped]
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

  @uxt
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |
