@testAll
Feature: Login - Forgot Password
  As a user i want to be able to reset my password when i forget it

  Scenario: Do the login with correct credentials
    Given i am in login page
    And i change the language to english
    And change language successfully
    And i forgot my password, so i click on the link
    Then i am redirected to the forgot password page