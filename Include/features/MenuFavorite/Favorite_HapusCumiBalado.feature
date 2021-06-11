@Feature
Feature: Hapus resep dari favorite

  @Scenario
  Scenario: Hapus resep favorite cumi balado
    Given Tap menu favorite3
    When Tap menu hapus
    Then Kembali ke main menu3