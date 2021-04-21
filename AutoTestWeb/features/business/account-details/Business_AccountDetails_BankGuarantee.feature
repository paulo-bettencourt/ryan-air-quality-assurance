@testAll @ARD-11631 @business
Feature: Business - Account Details

  Scenario Outline: Business - Bank Guarantee Account Details
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i can view the accounts list view
    Then i click on the kebab menu of bank guarantee account
    Then i click to see details on the bank guarantee kebab
    Then business bank guarantee account details are loaded

  @test
    Examples:
      | username | password |
      | business.aa | Password1* |

    # No users with bank guarantee account
   @uxt-[skipped]
    Examples:
      | username | password |
      | armando.business | Password1* |
