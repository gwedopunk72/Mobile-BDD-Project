@Feature
Feature: Add resep favorite

  @Scenario
  Scenario: Menambahkan resep cumi balado ke menu favorite
    Given Tap kategori cumi
    When Tap cumi balado
    And Tap add favorite1
    Then Kembali ke main menu1