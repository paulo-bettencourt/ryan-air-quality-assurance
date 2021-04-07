@testAll
Feature: Login with email
  As a user i want to be able to login with my email

  Scenario: Do the login with correct credentials
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "ana.rita.camara@bringglobal.com" and "Password1*"
    And i logged in successfully


  Scenario: Do the login with wrong credentials
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "jose.correia@bringglobal.com" and "Password1234"
    And my login failed