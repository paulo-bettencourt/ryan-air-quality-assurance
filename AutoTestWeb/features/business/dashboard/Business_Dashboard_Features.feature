@testAll @business

Feature: Business - Dashboard Features - Latest Transactions and Favorite Accounts

  Scenario Outline: Business - Favorite Accounts
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i am on the business dashboard
    And i can see the favorite accounts

  #not working on test, SA selection error that will be fixed when UXT is imported to TEST
  @test-[skipped]
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

  @uxt
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

  Scenario Outline: Business - Latest Transactions
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i am on the business dashboard
    And i can see the latest transactions

  #not working on test, SA selection error that will be fixed when UXT is imported to TEST
  @test-[skipped]
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

    @uxt
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |
