@testAll @retail
Feature: Login - Forgot Password
  As a user i want to be able to reset my password when i forget it

  Scenario: Login - Forgot Password
    Given i am in login page
    And i change the language to english
    And change language successfully
    And i forgot my password, so i click on the link
    Then i am redirected to the forgot password page