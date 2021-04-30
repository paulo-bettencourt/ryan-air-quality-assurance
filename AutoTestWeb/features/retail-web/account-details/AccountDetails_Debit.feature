@testAll
  Feature: Account Details - Debit Account
    As a user i want to see my debit account details

    Scenario: Debit Account Details
      Given i am in login page
      And i change the language to english
      And change language successfully
      Then i want to login with "luis.amorim" and "Password1*"
      And i logged in successfully
      Then i can click on a "debit" account
      And click account details tab
      And Account details are loaded