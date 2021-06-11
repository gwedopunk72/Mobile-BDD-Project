@Feature
Feature: View Resep Bakwan Jamur

  @Scenario
  Scenario: View Resep Bakwan jamur
    Given Tap kategori jamur
    When Tap bakwan jamur
    And Tap cara memasak2
    Then Kembali ke menu utama2