@testAll
Feature: BEP - Search User
  As a user i want to be able to search for a user on the bank employee portal

  Scenario Outline: BEP - Search User
    Given i am in the BEP login page
    Then i want to login with "<username>" and "<password>"
    Then i search for "<search>"
    And i click on the user first user

  @uxt
    Examples:
      | username | password | search |
      | employee1 | Password1* | ana.camara |