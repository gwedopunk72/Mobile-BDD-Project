@Feature
Feature: Melihat resep favorite

  @Scenario
  Scenario: Melihat resep favorite bebek bacem
    Given Tap menu favorite
    When Tap menu lihat
    Then Kembali ke main menu2