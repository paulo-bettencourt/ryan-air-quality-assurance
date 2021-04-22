@testAll @ARD-11467  @ARD-11463
Feature: Business - Dashboard Navigation bar

  Scenario Outline: Business - Navigation Bar
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i am on the business dashboard
    And i can see the navigation bar

      #not working on test, SA selection error that will be fixed when UXT is imported to TEST
  @test-[skipped]
    Examples:
      | username | password | context |
      | patricia.company2 | Password1* | sa_patricia.company |

  @uxt
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

  Scenario Outline: Business - View name and context
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i am on the business dashboard
    And i can view username "<username>" and context "<context>"

                  #not working on test, SA selection error that will be fixed when UXT is imported to TEST
  @test-[skipped]
    Examples:
      | username | password | context | context2 |
      | patricia.company | Password1* | sa_patricia.company | sa_patricia.company_2 |

  @uxt
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |
