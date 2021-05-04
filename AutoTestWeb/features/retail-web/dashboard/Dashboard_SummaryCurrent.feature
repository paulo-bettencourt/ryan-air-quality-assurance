@testAll
Feature: Dashboard - Summary of Current Account
  As a user i want to be able to see the summary of Current Account on the Dashboard

  Scenario Outline: Load Dashboard - Summary of Current Account
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully
    Then i can click on a "<account>" account
    And i am redirected to the transactions page

  @uxt
    Examples:
      | username | password | account |
      | real1 | Password1* | current   |
