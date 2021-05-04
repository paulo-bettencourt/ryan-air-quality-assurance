@testAll
Feature: Transaction Details - Debit Account
  As a user i want to be able to see my Debit Account transaction details

  Scenario Outline: Debit Transaction Details
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully
    Then i can click on a "<account>" account
    And i am redirected to the transactions page
    Then i can click on the first transaction
    And i can see the transaction details

  @uxt
    Examples:
      | username | password | account |
      | luis.amorim | Password1* | debit |
