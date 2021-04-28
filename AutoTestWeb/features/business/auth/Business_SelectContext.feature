@testAll @ARD-11464
Feature: Business - Select Context

  Scenario Outline: Business - Select Context
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"

    @test
    Examples:
      | username  | password   | context      |
      | companyb1 | Password1* | sa_companyB1 |

    @uxt
    Examples:
      | username         | password   | context             |
      | patricia.company | Password1* | sa_patricia.company |
