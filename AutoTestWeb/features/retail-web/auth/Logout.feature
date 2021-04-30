@testAll @retail
Feature: Logout
  As a user i want to be able to logout

  Scenario Outline: Do logout
    Given i am in login page
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully
    And want to logout
    And logout successfully

    @uxt
    Examples:
      | username | password |
      | real1 | Password1* |