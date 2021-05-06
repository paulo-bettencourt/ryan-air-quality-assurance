@testAll @business
Feature: Business - Account Details

 Scenario Outline: Business - Debit Account Details
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i can view the accounts list view
    Then i click on the kebab menu of debit account
    Then i click to see details on the debit kebab
    Then business debit account details are loaded

  @test
    Examples:
      | username | password |
      | loan.debit.biz| Password1* |

  # No users with debit account
  @uxt-[skipped]
    Examples:
      | username | password |
      | loan.debit.biz | Password1* |