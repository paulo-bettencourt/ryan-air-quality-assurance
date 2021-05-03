@testAll @ARD-11465
Feature: Logout
  As a user i want to be able to logout

  Scenario Outline: Business - Logout of the platform
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i am on the business dashboard
    And want to logout
    And logout successfully

  @test
    Examples:
      | username | password | context |
      | companyb1 | Password1* | sa_companyB1 |

  @uxt
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |
