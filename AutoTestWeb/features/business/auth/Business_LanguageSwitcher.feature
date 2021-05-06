@testAll @business
Feature: Business Language Switcher
  As a user i want to be able to change language in business

  Scenario Outline: Change Language Business in Dashboard
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i am on the business dashboard
    And i press to change language in dashboard
    And i confirm i am on the business dashboard in portuguese

    @test
    Examples:
      | username         | password   | context             |
      | patricia.company | Password1* | sa_patricia.company |

    @uxt
    Examples:
      | username         | password   | context             |
      | patricia.company | Password1* | sa_patricia.company |

  Scenario Outline: Change Language Business
    Given i am in the business login page
    And i change the language to <language>
    And change language successfully

    @test
    Examples:
      | language |
      | english |

    @uxt
    Examples:
      | language |
      | english |
