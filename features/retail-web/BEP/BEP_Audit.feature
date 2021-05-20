@testAll @retail
Feature: BEP - Audit
  As a user i want to be able to search for contacts, transfers, and bill payments on BEP audit menu

  Scenario Outline: BEP - Audit - Contacts
    Given i am in the BEP login page
    Then i want to login with "<username>" and "<password>"
    Then i click on the Audit menu
    And i click on My Categories dropdown
    Then i select Contacts option
    And i click on the continue button
    And i can see the list with results

    @uxt
    Examples:
      | username | password |
      | employee-manager | Password1* |

  Scenario Outline: BEP - Audit - Transfers
    Given i am in the BEP login page
    Then i want to login with "<username>" and "<password>"
    Then i click on the Audit menu
    And i click on My Categories dropdown
    Then i select Payments option
    And i click on Type dropdown
    And i select Payments option Type dropdown
    And i click on the continue button
    And i can see the list with results

  @uxt
    Examples:
      | username | password |
      | employee-manager | Password1* |


  Scenario Outline: BEP - Audit - Bill Payments
    Given i am in the BEP login page
    Then i want to login with "<username>" and "<password>"
    Then i click on the Audit menu
    And i click on My Categories dropdown
    Then i select Payments option
    And i select Bill Payments on Type dropdown
    And i click on the continue button
    And i can see the list with results

  @uxt
    Examples:
      | username | password |
      | employee-manager | Password1* |
