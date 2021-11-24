@testAll
Feature: Login
  As a user i want to be able to login into our portal

  Scenario: Do the login with correct credentials
    Given i am in the index page
   Then i want to travel from "Terceira Lajes" to "Lisboa"
    And i want to select the trips
    And i want to continue with the value price
    Then i want to login later
    And i want to write down the pax names
    Then i want to take a small luggage
    Then i dont want to take any more luggage
    And i want to select seats later
    And i am sure that everything is ok with my trip