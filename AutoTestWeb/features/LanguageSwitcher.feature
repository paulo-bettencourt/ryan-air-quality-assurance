@testAll
Feature: Language Switcher
  As a user i want to be able to change language

  Scenario: Change Language
    Given i am in login page
    And i change the language to english
    And change language successfully
