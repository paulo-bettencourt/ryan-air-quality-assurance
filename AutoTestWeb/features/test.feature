@testAll
Feature: Login Page
  As a user i want to be able to login

#  Scenario: First time login
#    Given i have created a new user
#    And i am in login page
##    Then i want to login with "Rita" and "1qazZAQ!"

  Scenario: Do the login
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully

  Scenario: Do logout
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    And want to logout
    And logout successfully

  Scenario: Change Language
    Given i am in login page
    Then want to change language
    And change language successfully

  Scenario: Find Branches
    Given i am in login page
    Then want to find nearest branches
    And found branches successfully

  Scenario: Marketing banner
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And click on banner
    And redirect successfully

  Scenario: Load Dashboard - Summary of Current Account
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then Dashboard is loaded

  Scenario: Account Selector & Details
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then select current account from dashboard
    Then select loan account from account selector
    And click account details tab
    And account details are loaded