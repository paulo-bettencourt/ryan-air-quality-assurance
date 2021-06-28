@testAll @business
Feature: Business - Account Details

  Scenario Outline: Business - Loan Account Details
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i can view the accounts list view
    Then i click on the kebab menu of loan account
    Then i click to see details on the loan kebab
    Then business loan account details are loaded

  @test
    Examples:
      | username | password |
      | loan.debit.biz | Password1* |

   # Feature still unstable in UXT ( No user with Loan Account)
  @uxt-[skipped]
    Examples:
      | username | password |
      | companya12 | Password1* |
