@testAll
Feature: Credijá - Review
  As a user i want to be able to go to loans menu, change the amounts, see the contracts and go to review page

  Scenario: Credijá - Review
    Given i am in login page
    Then want to change language
    And change language successfully
    Then i want to login with "101409test" and "Password1*"
    And i logged in successfully
    Then i click on the credijá banner
    And i change the monthly amount to "12345"
    Then i click on the life insurance contract
    And i am redirected to the life insurance contract
    Then i click on the product sheet contracts
    And i am redirected to the product sheet contract
    Then i click on the next button
    And i am on the credija review page
    Then i click on the request button
    Then i click on the Preview button
    And i check the boxes
    Then The authorize button is enable
    And Click on the cancel button