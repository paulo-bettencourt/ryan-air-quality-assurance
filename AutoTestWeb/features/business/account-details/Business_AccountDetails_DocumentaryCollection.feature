@testAll @business
Feature: Business - Account Details

  Scenario Outline: Business - Documentary Collection Account Details
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i am on the accounts page
    And i can view the accounts list view
    Then i click on the kebab menu of documentary collection account
    Then i click to see details on the documentary collection kebab
    Then business documentary collection account details are loaded

  @test
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

    # Feature still unstable in UXT (Documentary Coll details not visible)
  @uxt-[skipped]
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |
