@testAll @retail
Feature: Marketing Banner
  As a user i want to be able to click on the marketing banner and be redirected to the "herois de azul" page

  Scenario Outline: Marketing banner
    Given i am in login page
    Then i want to login with "<username>" and "<password>"
    And click on banner
    And redirect successfully

  @uxt
    Examples:
      | username | password |
      | real1 | Password1* |