@testAll @ARD-12117 @ARD-11630 @business
Feature: Business - Account Details

  Scenario Outline: Business - Account Details - Account Selector
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i am on the business dashboard
    And i can view the accounts list view
    Then i click on the kebab button of the first account
    Then i click to see details on the kebab
    Then i can view account selector

  @test
    Examples:
      | username | password | context |
      | companyb1 | Password1* | sa_companyB1 |

  @uxte
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

  Scenario Outline: Business - Current Account Details
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i can view the accounts list view
    Then i click on the kebab button of the first account
    Then i click to see details on the kebab
    Then i can view account selector
    Then business current account details are loaded

  @test
    Examples:
      | username | password |
      | patricia.company | Password1* |

  @uxte
    Examples:
      | username | password |
      | patricia.company | Password1* |


