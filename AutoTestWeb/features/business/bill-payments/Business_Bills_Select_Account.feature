@testAll @ARD-13127
Feature: Business Bill Payments - Select Debit Account

  Scenario Outline: Business Bill - Select Debit
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i enter and confirm i am in bill payments page
    And search for the "<entity>" entity on the search bar
    And i select a current account from selector dropdown
    Then i confirm account name "<accountName>" and the account number "<accountNumber>" are displayed

  @test
    Examples:
      | username | password | context | entity | accountName | accountNumber |
      | companyb1 | Password1* | sa_companyB1 | 103 | Corporate Curre | 1000511545|

  @uxt
    Examples:
      | username | password | context | entity | accountName | accountNumber |
      | patricia.company | Password1* | sa_patricia.company | 103 | Corporate Curre | 1000511545|

