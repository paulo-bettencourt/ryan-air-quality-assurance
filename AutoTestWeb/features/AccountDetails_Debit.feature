@testAll
  Feature: as a user i want to see my debit account details

    Scenario: Debit account details
      Given i am in login page
      Then i want to login with "real1" and "Password1*"
      And i logged in successfully
      Then i can click on a debit account
      And click account details tab
      And Debit card details are loaded