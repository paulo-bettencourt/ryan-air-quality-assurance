@testAll
Feature: Bill Payments - Filter
  As a user i want to be able to filter my bill payments successfully made

  Scenario: Bill Payments - Filter for State Payments
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i click on bill payments on the nav bar
    And i select the My Payments tab
    Then i filter for the State Payments Payment type
    And i click on the apply button
    And it shows the results