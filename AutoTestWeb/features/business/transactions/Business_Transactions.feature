@testAll @business
Feature: Business - Transactions

  Scenario Outline: Business - Transactions Print
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i enter and confirm i am in transactions page
    Then i select an account in transactions
    And i see and press the print button

    #not working on test, SA selection error that will be fixed when UXT is imported to TEST
    @test-[skipped]
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

    @uxt
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

  Scenario Outline: Business - Transactions Filter
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i enter and confirm i am in transactions page
    Then i select an account in transactions
    And i see and click the filter button

    #not working on test, SA selection error that will be fixed when UXT is imported to TEST
    @test-[skipped]
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

    @uxt
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

  Scenario Outline: Business - Transactions Search
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i enter and confirm i am in transactions page
    Then i select an account in transactions
    And i see and search the transactions

    #not working on test, SA selection error that will be fixed when UXT is imported to TEST
    @test-[skipped]
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

    @uxt
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

  Scenario Outline: Business - Transactions Export to CSV
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i enter and confirm i am in transactions page
    Then i select an account in transactions
    And i see and click the export to CSV button

    #not working on test, SA selection error that will be fixed when UXT is imported to TEST
    @test-[skipped]
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

    @uxt
    Examples:
      | username | password | context |
      | patricia.company | Password1* | sa_patricia.company |

  Scenario Outline: Business - Transaction Details
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>" for portuguese user
    And i enter and confirm i am in transactions page
    Then i select an account in transactions
    Then i select a transaction and see details modal

  #not working on test, SA selection error that will be fixed when UXT is imported to TEST
  @test-[skipped]
    Examples:
      | username | password | context |
      | denise.silva | Password1* | sa_denise.silva |

  @uxt
    Examples:
      | username | password | context |
      | denise.silva | Password1* | sa_denise.silva |
