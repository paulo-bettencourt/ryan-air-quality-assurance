@testAll

Feature: Business - Bill Payments Page

 Scenario Outline: Business - Bill Payments - Navigation
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i enter and confirm i am in bill payments page

   @test
   Examples:
     | username | password | context |
     | companyb1 | Password1* | sa_companyB1 |

   @uxt
   Examples:
     | username | password | context |
     | patricia.company | Password1* | sa_patricia.company |


 Scenario Outline: Review Page with Rechargeable Payment - Business
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i enter and confirm i am in bill payments page
    And search for the "<entity>" entity on the search bar
    And i insert a reference "<reference>"
    Then i select an amount rechargeable
    And i am able to click on Next button for Rechargeable
    Then i am on the review page

  @test
    Examples:
      | username | password | context | entity | reference |
      | companyb1 | Password1* | sa_companyB1 | 103 | 123456789 |

  @uxt
    Examples:
      | username | password | context | entity | reference |
      | patricia.company | Password1* | sa_patricia.company | 103 | 123456789 |


#  Scenario: Review Page with Reference Payment
#    Given i am in the business login page
#    Then i want to login with "denise.silva" and "Password1*"
#    And i confirm i am in select context page
#    And i select the context "sa_denise.silva" for portuguese user
#    And i enter and confirm i am in bill payments page
#    And search for the "102" entity on the search bar
#    And i insert a reference "123456789"
#    Then i insert an amount "123" for Reference
#    And i am able to click on Next button for Reference
#    Then i am on the review page
#
#  Scenario: Business Review Page with State Payment
#    Given i am in the business login page
#    Then i want to login with "denise.silva" and "Password1*"
#    And i confirm i am in select context page
#    And i select the context "sa_denise.silva" for portuguese user
#    And i enter and confirm i am in bill payments page
#    And in business search for the "623" entity on the search bar
#    And i insert a reference "123456789"
#    Then i insert an amount "123" for Reference
#    And i am able to click on Next button for Reference
#    Then i am on the review page
