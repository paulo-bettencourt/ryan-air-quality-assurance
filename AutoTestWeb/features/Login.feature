@testAll
Feature: Login
  As a user i want to be able to login

  Scenario: Do the login
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully