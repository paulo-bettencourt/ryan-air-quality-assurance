@testAll @business
Feature: Business - Account Details

  Scenario Outline: Business - Account Details - Account Selector
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i am on the accounts page
    And i can view the accounts list view
    Then i click on the kebab button of the current account
    Then i click to see details on the kebab
#    Then i can view account selector

  @test
    Examples:
      | username | password | context |
      | companyb1 | Password1* | sa_companyB1 |

  @uxt
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

  Scenario Outline: Business - Current Account Details
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i am on the accounts page
    And i can view the accounts list view
    Then i click on the kebab button of the current account
    Then i click to see details on the kebab
#    Then i can view account selector
    Then business current account details are loaded

  @test
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_companyB1 |

  @uxt
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |


  Scenario Outline: Business - Print account details
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i am on the accounts page
    And i can view the accounts list view
    Then i click on the kebab button of the current account
    Then i click to see details on the kebab
    Then business current account details are loaded
    And i print the account details

  @test
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_companyB1 |

  @uxt
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |
