Feature: US1006 kullanıcı guru99 sitesine gider istenen aramaları yapar
@wip
  Scenario: TC guru99 sistesi girmeli istenen aramaları yapmalı

  Given kullanici "guru99Url1" anasayfaya gider
    Then Sayfanın title’ında Telecom yazdığını doğrulayın
    And Add Costumer sayfasına gidin
    And Formu doldurup submit ekleyin
    And Kaydın başarıyla yapıldığı doğrulayın
    And Kullanıcının costumer id’sini yazdırın
    And sayfayi kapatir



