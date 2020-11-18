@testAll

Feature: Login
  As a user i want to be able to login

  Scenario: Do the login with correct credentials
    Given i am in login page
    Then want to change language
    And change language successfully
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully


  Scenario: Do the login with wrong credentials
    Given i am in login page
    And i change the language to english
    Then i want to login with "real1" and "Password1234"
    And my login failed