@testAll
Feature: Marketing Banner
  As a user i want to be able to click on the marketing banner and be redirected to the "herois de azul" page

  Scenario: Marketing banner
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And click on banner
    And redirect successfully