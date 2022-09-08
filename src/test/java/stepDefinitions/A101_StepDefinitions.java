package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.A101Page;
import utilities.ConfigReader;
import utilities.Driver;

public class A101_StepDefinitions {

    A101Page a101Page = new A101Page();
/*
Uçtan uca ödeme ekranına kadar Selenium’da java dili ile chrome browser kullanarak test otomasyon ödevi yapılacak.

Ödeme ekranı doldurulmayacak.
Aşağıdaki senaryoyu web ve mobil olmak üzere 2 çeşit oluşturabilirlerse çok iyi olur.
En az Web’de yapmak zorunlu.
Bir yeni müşteri kaydı oluşturulacak.
Login olduktan sonra

* Kategoriler ---Kadın---Giyim---bluz bölümüne girip
* Filtreleme bölümünden renk seçeneği siyah seçilecek.
* Sonuçlar listele yapılıp ,gelen ürün sonuçlarından biri seçilip ,üstüne tıklanacak.
* Beden medium seçilecek ,sepete ekle butonuna tıklanacak.
* Sepetim’e gidilecek ,ürünün adı ,adeti ,bedeni kontrol edilecek.
* Ödeme yap butonuna tıklayıp,ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini kontrol edecekler.

 */
    @Given("Kullanici A101 Anasayfasinda")
    public void kullanici_a101_anasayfasinda() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("A101Url"));
        //Thread.sleep(5000);
    }

    @Then("Kullanici A{int} Anasayfasinda Giris Yap a tiklar")
    public void kullaniciAAnasayfasindaGirisYapATiklar(int arg0) throws InterruptedException {

        a101Page.cookie.click();  //site girisindeki cerez uyarisini kabul ediyoruz
        Thread.sleep(2000);  //2 sn bekletme
        a101Page.girisYap1.click();

    }


    @Then("Kullanici A101 Anasayfasinda Giris Yap a tekrar tiklar")
    public void kullanici_a101_anasayfasinda_giris_yap_a_tekrar_tiklar() {
        a101Page.girisYap2.click();
    }

    @Then("Kullanici Cep telefon bilgisini girer")
    public void kullanici_cep_telefon_bilgisini_girer() throws InterruptedException {
        a101Page.cepTel.click();
        a101Page.cepTel.sendKeys("469502069");
        Thread.sleep(2000);
    }

    @Then("Kullanici Giris Yap Butonuna tiklar")
    public void kullanici_giris_yap_butonuna_tiklar() throws InterruptedException {
        a101Page.GIRISYAP.click();
        Thread.sleep(30000); // cep telefonuna gelen dogrulama kodunu girebilmek icin 30 sn beklettim

        //!!!! bu sayfadaki cep telefonuna gelen dogrulama kodunu manuel olarak girmek zorundayiz.
        //Sadece cep telefonuna gelen dogrulama kodunu gir birak. herhangi bir tusa basma  !!!

    }

    @Then("Kullanici dogrula butonuna tiklar")
    public void kullaniciDogrulaButonunaTiklar() throws InterruptedException {
        a101Page.dogrulaButonu.click();
        Thread.sleep(3000);
    }


    @Then("kullanici arama kutusuna Kadin Bluz yazar ve ENTER a tiklar")
    public void kullaniciAramaKutusunaKadinBluzYazarVeENTERATiklar() throws InterruptedException {
        a101Page.aramaKutusu.sendKeys("Kadin Bluz");
        a101Page.arabutonu.click();

    }
    @Then("Kullanici siyah reng secenegine tiklar")
    public void kullanici_siyah_reng_secenegine_tiklar() throws InterruptedException {
        a101Page.siyahRenk.click();
        Thread.sleep(2000);
    }

    @Then("Kullanici ilk urune tiklar")
    public void kullanici_ilk_urune_tiklar() throws InterruptedException {
        a101Page.ilkUrun.click();
        Thread.sleep(2000);
    }

    @Then("Kullanici bedeni Medium secer")
    public void kullanici_bedeni_medium_secer() throws InterruptedException {
        a101Page.bedenM.click();
        Thread.sleep(3000);
    }

    @Then("Kullanici urunu sepete ekler")
    public void kullanici_urunu_sepete_ekler() throws InterruptedException {
        a101Page.sepeteEkleButonu.click();
        Thread.sleep(2000);
        a101Page.sepetiGoruntuleButonu.click();
        Thread.sleep(2000);

    }

    @Then("Kullanici sepete gider dogru urun eklendigini test eder")
    public void kullanici_sepete_gider_dogru_urun_eklendigini_test_eder() throws InterruptedException {
        String arananUrunAdi = "Calvin Klein CJ9T1329-BLK Kadın Body Siyah";
        String bulunanUrunAdi = a101Page.aramaSonucElementi.getText();
        Assert.assertTrue(bulunanUrunAdi.contains(arananUrunAdi));
        Thread.sleep(3000);
        a101Page.sepetiOnaylaButonu.click();
        Thread.sleep(3000);
        a101Page.kargoSec.click();
        Thread.sleep(3000);
        a101Page.kaydetVeDevamEt.click();

    }

    @Then("Kullanici odeme yap a tiklar ve dogru ekrana yonlendirildigini test eder")
    public void kullanici_odeme_yap_a_tiklar_ve_dogru_ekrana_yonlendirildigini_test_eder() {
        String expectedUrl = "https://www.a101.com.tr/orders/checkout/";
        String actuelUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actuelUrl,expectedUrl);
    }



}
