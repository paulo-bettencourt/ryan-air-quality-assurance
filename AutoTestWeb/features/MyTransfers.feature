@testAll
Feature: Transfer - My Transfers Details
 As a user i want to see My Transfers Details

  Scenario: See My Transfers Details
    Given i am in login page
    Then i want to login with "real1" and "Password1*"
    Then i logged in successfully
    Then i can click on new transfer on the quick action button
    And i am redirected to the new transfer page
    Then i click on My Transfers
    And i am on My Transfers Page
    Then i open a Transfers and see their details