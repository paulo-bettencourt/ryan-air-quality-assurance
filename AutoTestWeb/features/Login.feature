@testAll

Feature: Login
  As a user i want to be able to login

  Scenario Outline: Do the login with correct credentials
    Given i am in login page
#    And i change the language to english
#    And change language successfully
    Then i want to login with "<username>" and "<password>"
    And i logged in successfully

  @test
    Examples:
      | username | password |
      | real1 | Password1* |

  @uxt
    Examples:
      | username | password |
      | real2 | Password1* |

###  This is failing due to the date switcher, skipped for now

#  Scenario Outline: Do the login with wrong credentials
#    Given i am in login page
#    And i change the language to english
#    And change language successfully
#    Then i want to login with "<username>" and "<password>"
#    And my login failed
#
#  @test
#    Examples:
#      | username | password |
#      | real1 | Password1* |
#
#  @uxt
#    Examples:
#      | username | password |
#      | real2 | Password1* |
