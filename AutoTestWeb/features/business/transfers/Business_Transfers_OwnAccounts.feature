@testAll
Feature: Business Transfer - Own Accounts
  As a user i want to be able to do transfers between my own SBA account

  Scenario Outline: Business Transfer Savings account to Current account - Same Bank - Own Account
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>" for portuguese user
    And i enter and confirm i am in transfers page
    Then i search and select the account "<debitaccount>"
    Then i select my own account "<ownaccount>"
    And i enter the amount "<amount>" to transfer
    And i see and click the continue button
    And i confirm the transfer and see the success submitted message

  #not working on test, SA selection error that will be fixed when UXT is imported to TEST
  @test-[skipped]
    Examples:
      | username | password | context | amount | debitaccount | ownaccount |
      | bjorn.ab | Password1* | sa_bjorn.ab | 100| Curre | 1002167280 |

  @uxt
    Examples:
      | username | password | context | amount | debitaccount | ownaccount |
      | bjorn.ab | Password1* | sa_bjorn.ab | 100| Curre | 1002167280 |
