@testAll @retail
Feature: Account Details - Current Account
  As a user i want to be able to see my Current Account details

  Scenario Outline: Current Account Details
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
      | luis.amorim | Password1* | current |