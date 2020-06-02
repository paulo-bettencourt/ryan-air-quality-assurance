@testAll
Feature: Transfer - Other Accounts
  As a user i want to be able to do transfers to other banks accounts

  Scenario: Transfer Savings account to John Doe
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i can click on new transfer on the quick action button
    And i am redirected to the new transfer page
    Then i select a savings account on the from selector
    And i select John Doe on the to selector
    And i insert "25" on the amount input
    Then i click on next button
    And i am redirected to the review page
    #  Next 4 lines are implemented, but commented because of the duplicated transfer error
#    Then i click on the authorize button
#    And i fill the OTP modal
#    Then click on the transfer button
#    And transfers was successfully made

  Scenario: Transfer Savings account to invalid IBAN
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i can click on new transfer on the quick action button
    And i am redirected to the new transfer page
    Then i select a savings account on the from selector
    And i insert a recipients name "abc"
    And i select IBAN tab
    And i insert "1111 1111 11111111111111111" on the IBAN input
    And i insert "25" on the amount input
    Then next button is disabled