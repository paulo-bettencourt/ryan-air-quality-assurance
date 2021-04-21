@testAll @ARD-11905
Feature: Business - Account Details

 Scenario Outline: Business - Letter of Credit Account Details
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i am on the accounts page
    And i can view the accounts list view
    Then i click on the kebab menu of letter of credit account
    Then i click to see details on the letter of credit kebab
#    Then business letter of credit account details are loaded
#    will be uncommented sometime when the loc details are available

  @test
    Examples:
      | username | password | context |
      | business.aa | Password1* | sa_companyB1 |

  # Feature still unstable in UXT ( LOC account details not visible)
  @uxt
    Examples:
      | username | password | context |
      | companya12 | Password1* | sa_companya12 |