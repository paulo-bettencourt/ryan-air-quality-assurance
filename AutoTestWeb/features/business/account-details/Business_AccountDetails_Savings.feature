@testAll @ARD-11629
Feature: Business - Account Details

  Scenario Outline: Business - Savings Account Details
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i am on the accounts page
    And i can view the accounts list view
    Then i click on the kebab menu of savings account
    Then i click to see details on the kebab
    Then business savings account details are loaded

  @test
    Examples:
      | username | password | context |
      | companyb1 | Password1* | sa_companyB1 |

  # Feature still unstable in UXT (No user with savings account)
  @uxt-[skipped]
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |