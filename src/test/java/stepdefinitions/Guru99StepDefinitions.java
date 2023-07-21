package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Guru99Page;
import utilities.Driver;

public class Guru99StepDefinitions {
    Guru99Page guru99Page =new Guru99Page();




    @Then("Sayfanın title’ında Telecom yazdığını doğrulayın")
    public void sayfanın_title_ında_telecom_yazdığını_doğrulayın() {

        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle="Telecom";

        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }
    @Then("Add Costumer sayfasına gidin")
    public void add_costumer_sayfasına_gidin() {
        guru99Page.addCostumer.click();

    }
    @Then("Formu doldurup submit ekleyin")
    public void formu_doldurup_submit_ekleyin() {

    }
    @Then("Kaydın başarıyla yapıldığı doğrulayın")
    public void kaydın_başarıyla_yapıldığı_doğrulayın() {

    }
    @Then("Kullanıcının costumer id’sini yazdırın")
    public void kullanıcının_costumer_id_sini_yazdırın() {

    }
    @Then("kullanıcı kredi  kartı üretme sayfasına gider")
    public void kullanıcı_kredi_kartı_üretme_sayfasına_gider() {

    }




}
