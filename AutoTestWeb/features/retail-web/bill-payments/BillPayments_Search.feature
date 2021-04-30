@testAll
Feature: Bill Payments - Search
  As a user i want to be able to search for my bill payments successfully made

 Scenario Outline: Bill Payments - Search
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully
    Then i click on bill payments on the nav bar
    And i select the My Payments tab
    Then i search for the "<payment>" payment
    And it shows the results for the search

  @uxt
    Examples:
      | username | password | payment |
      | luis.amorim | Password1* | 60002 |