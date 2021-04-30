@testAll
  Feature: Account Details - Credit Account
    As a user i want to see my credit account details

    Scenario: Credit Account details
      Given i am in login page
      And i change the language to english
      And change language successfully
      Then i want to login with "luis.amorim" and "Password1*"
      And i logged in successfully
      Then i can click on a "credit" account
      And click account details tab
      And Account details are loaded