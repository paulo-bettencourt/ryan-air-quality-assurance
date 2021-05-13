@testAll
Feature: Transfer - Other Accounts
  As a user i want to be able to do transfers to other banks accounts

  Scenario Outline: Transfer to valid IBAN
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully
    Then i can click on new transfer on the quick action button
    And i am redirected to the new transfer page
#    Then i select a savings account on the from selector #Line commented because the account is selected by default
    And i select "<recipient>" on the recipient name selector
    And i insert "<amount>" on the amount input
    Then i click on next button
    And i am redirected to the review page

  @uxt
    Examples:
      | username | password | recipient | amount |
      | real1 | Password1* | retail test | 3      |

  Scenario Outline: Transfer to invalid IBAN
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully
    Then i can click on new transfer on the quick action button
    And i am redirected to the new transfer page
    #    Then i select a savings account on the from selector #Line commented because the account is selected by default
    And i select IBAN tab
    And i insert a recipients name "<recipient>"
    And i insert "<iban>" on the IBAN input
    And i insert "<amount>" on the amount input
    Then next button is disabled

  @uxt
    Examples:
      | username | password | recipient | iban| amount |
      | real1 | Password1* | abc | 1111 1111 11111111111111111 | 25 |