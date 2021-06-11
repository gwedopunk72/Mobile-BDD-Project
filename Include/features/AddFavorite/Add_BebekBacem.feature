@Feature
Feature: Add resep favorite

  @Scenario
  Scenario: Menambahkan resep ke menu favorite
    Given Tap kategori bebek
    When Tap bebek bacem
    And Tap add favorite
    Then Kembali ke main menu