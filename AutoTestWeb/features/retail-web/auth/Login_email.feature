@testAll @retail
Feature: Login with email
  As a user i want to be able to login with my email

  Scenario Outline: Do the login with correct credentials
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully

  @uxt
    Examples:
      | username | password |
      | ana.rita.camara@bringglobal.com | Password1* |


  Scenario Outline: Do the login with wrong credentials
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And my login failed

  @uxt
    Examples:
      | username | password |
      | ana.rita.camara@bringglobal.com | Password123 |