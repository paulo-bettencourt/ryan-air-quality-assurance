@testAll @ARD-11450
Feature: Business Login Error Handling
  As a user i want to be able to see error messages on login when i make mistakes

  Scenario: Login with wrong credentials
    Given i am in the business login page
    Then i want to login with "real1" and "Password1234"
    And my login failed

  Scenario: Login with right password does not work because user is blocked
    Given i am in the business login page
    Then i want to login with "auto_test_blocked" and "Password1*"
    And i see the error message of right password, but account still blocked
