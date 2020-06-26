@testAll
Feature: Credit Card Details
  As a user i want to be able to see the details of my credit card

  Scenario: Credit Card Details
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    And i logged in successfully
    Then i click on cards on the nav bar
    Then i select one credit card
#    And i can see the credit card details  ---not implemented