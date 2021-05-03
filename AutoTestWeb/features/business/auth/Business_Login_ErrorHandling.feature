@testAll @ARD-11450
Feature: Business Login Error Handling
  As a user i want to be able to see error messages on login when i make mistakes

  Scenario Outline: Login with wrong credentials
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And my login failed

    @test
    Examples:
      | username | password |
      | real1 | Password123* |

    @uxt
    Examples:
      | username | password |
      | patricia.company | Password12345* |

  Scenario Outline: Login with right password does not work because user is blocked
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i see the error message of right password, but account still blocked

  @test-skipped
    Examples:
      | username | password |
      | auto_test_blocked | Password123* |

  # Currently user is not setup
    @uxt-skipped
    Examples:
      | username | password |
      | auto_test_blocked | Password12345* |