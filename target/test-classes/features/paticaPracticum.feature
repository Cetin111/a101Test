Feature: US001 A101 Test Otomasyon Practicum
  @a101
    Scenario: TC001 Uctan uca test otomasyonu
    Given Kullanici A101 Anasayfasinda
    Then Kullanici A101 Anasayfasinda Giris Yap a tiklar
    Then Kullanici A101 Anasayfasinda Giris Yap a tekrar tiklar
    Then Kullanici Cep telefon bilgisini girer
    Then Kullanici Giris Yap Butonuna tiklar
    Then Kullanici dogrula butonuna tiklar
    Then kullanici arama kutusuna Kadin Bluz yazar ve ENTER a tiklar
    And Kullanici siyah reng secenegine tiklar
    And Kullanici ilk urune tiklar
    And Kullanici bedeni Medium secer
    And Kullanici urunu sepete ekler
    And Kullanici sepete gider dogru urun eklendigini test eder
    And Kullanici odeme yap a tiklar ve dogru ekrana yonlendirildigini test eder





