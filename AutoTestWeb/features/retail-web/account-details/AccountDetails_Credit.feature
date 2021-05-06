@testAll @retail
  Feature: Account Details - Credit Account
    As a user i want to see my credit account details

    Scenario Outline: Credit Account details
      Given i am in login page
      And i change the language to english
      And change language successfully
      Then i want to login with "<username>" and "<password>"
      And i logged in successfully
      Then i can click on a "<card>" account
      And click account details tab
      And Account details are loaded


      @uxt
      Examples:
        | username | password | card |
        | luis.amorim | Password1* | credit |