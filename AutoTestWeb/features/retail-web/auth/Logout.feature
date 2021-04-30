@testAll
Feature: Logout
  As a user i want to be able to logout

  Scenario: Do logout
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    And want to logout
    And logout successfully