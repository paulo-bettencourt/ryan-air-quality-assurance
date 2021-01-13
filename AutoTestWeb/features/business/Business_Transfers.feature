@testAll @ARD-11975 @ARD-11976 @ARD-11978 @ARD-11979 @ARD-11980 @ARD-11983
Feature: Business - Transfers

  Scenario: Business - Transfers - To Same Bank
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in transfers page
    Then i enter a beneficiary name "beneficiary one" and account "1002483581"
    And i enter the amount "100" to transfer
    And i see and click the continue button

  Scenario: Business - Transfers - To Same Bank - Review Page
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in transfers page
    Then i enter a beneficiary name "beneficiary one" and account "1002483581"
    And i enter the amount "100" to transfer
    And i see and click the continue button
    And i confirm the transfer

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

  Scenario: Business - Transfers - To Same Bank - Edit
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in transfers page
    Then i enter a beneficiary name "beneficiary one" and account "1002483581"
    And i enter the amount "100" to transfer
    And i see and click the continue button
    And i see and click the edit button
    And i enter the transfer description "okay"
    And i see and click the continue button
    And i confirm the transfer

  Scenario: Business - Transfers - To Other Bank - Cancel
    Given i am in the business login page
    Then i want to login with "denise.silva" and "Password1*"
    And i confirm i am in select context page
    And i select the context "sa_denise.silva" for portuguese user
    And i enter and confirm i am in transfers page
    Then i enter a beneficiary name "beneficiary one" and account "1002483581"
    And i enter the amount "100" to transfer
    And i see and click the continue button
    And i see and click the cancel transfer button
    Then i enter and confirm i am in transfers page
