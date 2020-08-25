@testAll
Feature: Bill Payments - Search
  As a user i want to be able to search for my bill payments successfully made

  Scenario: Bill Payments - Search
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i click on bill payments on the nav bar
    And i select the My Payments tab
    Then i search for the "625" payment
    And it shows only the 625 payments