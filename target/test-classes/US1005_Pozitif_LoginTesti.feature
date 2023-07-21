
Feature: US1005 Pozitif LOgin Testi
  @wip

  Scenario:  TC kullanıcı doğru değerlerle uygulamaya giriş yapabilmeli

    Given kullanici "qdUrl" anasayfaya gider
    Then anasayfada login linkine click yapar
    And cookies kabul edilir
    And email kutusuna "qdGecerliUsername" yazar
    And 3 saniye bekler
    And password kutusuna "qdGecerliPassword" yazar
    When login butonuna basar
    Then basarili olarak giris yapildigini test eder
    And 3 saniye bekler
    And sayfayi kapatir