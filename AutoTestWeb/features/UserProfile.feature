@testAll
Feature: See user profile
  As a user i want to see my profile

  Scenario: I want to see the User Profile of login Client
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i click on user profile
    And i see the User Profile details