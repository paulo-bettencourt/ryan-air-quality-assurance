@testAll
Feature: Dashboard - Summary of Debit Account
  As a user i want to be able to see the summary of Debit Account on the Dashboard

  Scenario Outline: Load Dashboard - Summary of Debit Account
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully
    Then i can click on a "<account>" account
    And i am redirected to the empty transactions page

  @uxt
    Examples:
      | username | password | account |
      | real1 | Password1* | debit   |
