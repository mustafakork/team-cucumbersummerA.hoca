package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage =new AmazonPage();



    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("arama kutusuna Nutella yazip, ENTER tusuna basar")
    public void arama_kutusuna_nutella_yazip_enter_tusuna_basar() {

        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {

        String expectedıcerik ="Nutella";
        String actualıcerik =amazonPage.sonucYazıElementi.getText();
        Assert.assertTrue(actualıcerik.contains(expectedıcerik));

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }


    @Then("arama kutusuna Samsung yazip, ENTER tusuna basar")
    public void aramaKutusunaSamsungYazipENTERTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Samsung"+Keys.ENTER);
    }

    @And("arama sonuclarinin Samsung icerdigini test eder")
    public void aramaSonuclarininSamsungIcerdiginiTestEder() {
        String expectedıcerik ="Samsung";
        String actualıcerik =amazonPage.sonucYazıElementi.getText();
        Assert.assertTrue(actualıcerik.contains(expectedıcerik));

    }

    @Then("arama kutusuna Java yazip, ENTER tusuna basar")
    public void aramaKutusunaJavaYazipENTERTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Java"+Keys.ENTER);
    }

    @And("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String expectedıcerik ="Java";
        String actualıcerik =amazonPage.sonucYazıElementi.getText();
        Assert.assertTrue(actualıcerik.contains(expectedıcerik));
    }

    @Then("arama kutusuna {string} yazip, ENTER tusuna basar")
    public void aramaKutusunaYazipENTERTusunaBasar(String aranacakUrun) {
        amazonPage.aramaKutusu.sendKeys(aranacakUrun+Keys.ENTER);
    }

    @And("arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String aranacakıcerik) {
        String actualSonucYazısı=amazonPage.sonucYazıElementi.getText();
        Assert.assertTrue(actualSonucYazısı.contains(aranacakıcerik));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int bklemesüresi) {
        try {
            Thread.sleep(bklemesüresi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String ıstenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(ıstenenUrl));
    }
}
