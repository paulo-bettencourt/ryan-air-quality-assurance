@testAll
Feature: Bill Payments - Filter
  As a user i want to be able to filter my bill payments successfully made

  Scenario: Review Page with entity 808
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i click on bill payments on the nav bar
    And i select the My Payments tab
    Then i filter for the State Payments Payment type
    And it shows the results