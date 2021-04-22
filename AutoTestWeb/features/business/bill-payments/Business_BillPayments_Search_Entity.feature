@testAll @ARD-13126
Feature: Bill Payments - Search Entity
  As a user i want to be able to search for the entities to pay my bills

  Scenario Outline: Bill Payments - Search Entity
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i enter and confirm i am in bill payments page
    And search for the "<entity>" entity on the search bar
    Then i confirm i see "<entityName>" after inserting the entity number

  @test
    Examples:
      | username | password | context | entity | entityName |
      | companyb1 | Password1* | sa_companyB1 | 103 | 103 - MOVICEL Carregamento Online |

  @uxt
    Examples:
      | username | password | context | entity | entityName |
      | patricia.company | Password1* | sa_patricia.company | 103 | 103 - MOVICEL Carregamento Online |