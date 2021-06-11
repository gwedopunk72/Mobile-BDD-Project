@Feature
Feature: Fitur menu pada halaman informasi

  @Scenario
  Scenario: Cek redirection menu1 informasi
    Given Tap menu info
    When Tap bagikan
    And Tap kontak kami
    And Tap kirim resep
    Then Kembali ke helaman depan