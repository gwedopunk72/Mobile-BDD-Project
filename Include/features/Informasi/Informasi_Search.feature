@Feature
Feature: Fitur menu search

  @Scenario
  Scenario: Cek menu search
    Given Tap search menu
    When Add category daging dan ayam
    And Input text sop
    And Input text sate
    Then Close application