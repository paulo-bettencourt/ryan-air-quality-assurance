@testAll
Feature: Bill Payments - Search
  As a user i want to be able to search for my bill payments successfully made

  Scenario: Bill Payments - Search
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i click on bill payments on the nav bar
    And i select the My Payments tab
    Then i search for the "623" payment
    And it shows the results for the search