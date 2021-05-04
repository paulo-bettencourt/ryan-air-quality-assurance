@testAll
Feature: BEP - Login and Security
  As a user i want to be able to see a user's login and security tab

  Scenario Outline: BEP - Login and Security
    Given i am in the BEP login page
    Then i want to login with "<username>" and "<password>"
    Then i search for "<search>"
    And i click on the user first user
    Then i click on the login and security tab
    And i can see the login and security page

    @uxt
    Examples:
      | username | password | search |
      | employee1 | Password1* | ana.camara |
