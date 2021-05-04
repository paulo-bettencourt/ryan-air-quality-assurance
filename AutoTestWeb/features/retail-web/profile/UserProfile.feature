@testAll
Feature: See user profile
  As a user i want to see my profile

  Scenario Outline: I want to see the User Profile of login Client
    Given i am in login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully
    Then i click on user profile
    And i see the User Profile details

  @uxt
    Examples:
      | username | password |
      | ana.camara | Password1* |