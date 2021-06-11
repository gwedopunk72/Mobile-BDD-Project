@Feature
Feature: View Resep Ayam Teriyaki

  @Scenario
  Scenario: Cek View Resep Ayam Teriyaki
    Given Open app Resep Masakan
    When Tap kategori ayam
    And Tap ayam teriyaki
    And Tap cara memasak
    Then Kembali ke menu utama