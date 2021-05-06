@testAll @business
Feature: Business - Dashboard Change Context

  Scenario Outline: Business - Change Context
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i am on the business dashboard
    And i want to change context
    And i select the context "<context2>"
    And i am on the business dashboard

      #not working on test, SA selection error that will be fixed when UXT is imported to TEST
  @test-[skipped]
    Examples:
      | username | password | context | context2 |
      | patricia.company | Password1* | sa_patricia.company | sa_patricia.company_2 |

  @uxt
    Examples:
      | username | password | context | context2 |
      | patricia.company | Password1* | sa_patricia.company | sa_patricia.company_2 |
