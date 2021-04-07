@testAll @ARD-11425
Feature: Business Login
  As a user i want to be able to login into business portal

  Scenario Outline: Business - Do the login with correct credentials
    Given i am in the business login page
    And i change the language to english
    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page

#  @test
#    Examples:
#      | username | password |
#      | business.aa | Password1* |

  @uxt
    Examples:
      | username | password |
      | patricia.company | Password1* |

  @uat
    Examples:
      | username | password |
      | patricia.company | Password1* |

  Scenario: Business - Do the login with wrong credentials
    Given i am in the business login page
    And i change the language to english
    And change language successfully
    Then i want to login with "real1" and "Password1234"
    And my login failed

