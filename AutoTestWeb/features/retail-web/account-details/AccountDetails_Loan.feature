@testAll @retail
Feature: Account Details - Loan Account
  As a user i want to be able to see my Loan Account details

  Scenario Outline: Loan Account Details
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully
    Then i can click on a "<account>" account
    And click account details tab
    And Account details are loaded

  @uxt
    Examples:
      | username | password | account |
      | real2 | Password1* | loans |