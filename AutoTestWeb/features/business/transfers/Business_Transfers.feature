@testAll @business
Feature: Business - Transfers

  Scenario Outline: Business - Transfers - To Same Bank
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i enter and confirm i am in transfers page
    Then i search and select the account "<debitaccount>"
    Then i enter a beneficiary name "<beneficiary>" and account "<account>"
    And i enter the amount "<amount>" to transfer
    And i see and click the continue button

  #not working on test, SA selection error that will be fixed when UXT is imported to TEST
  @test-[skipped]
    Examples:
      | username | password | context | beneficiary | account | amount | debitaccount |
      | patricia.company | Password1* | sa_patricia.company | beneficiary one | 1002483581 | 100| Curre |

  @uxt
    Examples:
      | username | password | context | beneficiary | account | amount | debitaccount |
      | patricia.company | Password1* | sa_patricia.company | beneficiary one | 1002483581 | 100| Curre |

  Scenario Outline: Business - Transfers - To Same Bank - Review Page
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i enter and confirm i am in transfers page
    Then i search and select the account "<debitaccount>"
    Then i enter a beneficiary name "<beneficiary>" and account "<account>"
    And i enter the amount "<amount>" to transfer
    And i see and click the continue button

  #not working on test, SA selection error that will be fixed when UXT is imported to TEST
  @test-[skipped]
    Examples:
      | username | password | context | beneficiary | account | amount | debitaccount |
      | patricia.company | Password1* | sa_patricia.company | beneficiary one | 1002483581 | 100| Curre |

  @uxt
    Examples:
      | username | password | context | beneficiary | account | amount | debitaccount |
      | patricia.company | Password1* | sa_patricia.company | beneficiary one | 1002483581 | 100| Curre |

#  For some reason the modal does not open.
#  Scenario: Business - Transfers - To Other Bank
#    Given i am in the business login page
#    Then i want to login with "denise.silva" and "Password1*"
#    And i confirm i am in select context page
#    And i select the context "sa_denise.silva" for portuguese user
#    And i enter and confirm i am in transfers page
#    And i click on other bank option button
#    Then i enter other bank beneficiary name "beneficiary two" and account "AO06000600000180417130222"
#    And i enter the amount "205" to transfer
#    And i see and click the continue button
#    And i see TOTP modal and enter the TOTP code
#    And i confirm the transfer

  Scenario Outline: Business - Transfers - To Same Bank - Edit
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i enter and confirm i am in transfers page
    Then i search and select the account "<debitaccount>"
    Then i enter a beneficiary name "<beneficiary>" and account "<account>"
    And i enter the amount "<amount>" to transfer
    And i see and click the continue button
    And i see and click the edit button
    And i enter the transfer description "okay"
    And i see and click the continue button
    And i verify transfer description "okay"

  #not working on test, SA selection error that will be fixed when UXT is imported to TEST
  @test-[skipped]
    Examples:
      | username | password | context | beneficiary | account | amount | debitaccount |
      | patricia.company | Password1* | sa_patricia.company | beneficiary one | 1002483581 | 100| Curre |

  @uxt
    Examples:
      | username | password | context | beneficiary | account | amount | debitaccount |
      | patricia.company | Password1* | sa_patricia.company | beneficiary one | 1002483581 | 100| Curre |

  Scenario Outline: Business - Transfers - To Other Bank - Cancel
    Given i am in the business login page
    Then i want to login with "<username>" and "<password>"
    And i confirm i am in select context page
    And i select the context "<context>"
    And i enter and confirm i am in transfers page
    Then i search and select the account "<debitaccount>"
    And i enter other bank beneficiary name "<beneficiary>" and account "<account>"
    And i enter the amount "<amount>" to transfer
    And i see and click the continue button
    And i see and click the cancel transfer button
    Then i enter and confirm i am in transfers page

  #not working on test, SA selection error that will be fixed when UXT is imported to TEST
  @test-[skipped]
    Examples:
      | username | password | context | beneficiary | account | amount | debitaccount |
      | patricia.company | Password1* | sa_patricia.company | beneficiaryOtherBank | AO06 0004 0000 0173 5423 1029 7 | 100| Curre |

  @uxt
    Examples:
      | username | password | context | beneficiary | account | amount | debitaccount |
      | patricia.company | Password1* | sa_patricia.company | beneficiary one | AO06 0004 0000 0173 5423 1029 7 | 100| Curre |

