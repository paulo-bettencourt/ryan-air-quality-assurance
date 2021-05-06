@testAll @retail
Feature: Account Selector
  As a user i want to be able to change account on the transactions account selector and click on the Account details tab to see the Loan account details

  Scenario Outline: Account Selector
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully
    Then i can click on a "<account>" account
    Then select loan account from account selector
    And click account details tab
    And Account details are loaded

  @uxt
    Examples:
      | username | password | account |
      | luis.amorim | Password1* | current |