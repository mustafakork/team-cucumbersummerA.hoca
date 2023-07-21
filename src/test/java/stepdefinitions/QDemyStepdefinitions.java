package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import pages.QDemypage;
import utilities.ConfigReader;

public class QDemyStepdefinitions  {
    QDemypage qDemypage =new QDemypage();




    @Then("anasayfada login linkine click yapar")
    public void anasayfada_login_linkine_click_yapar() {
        qDemypage.ılklogin.click();
    }

    @And("cookies kabul edilir")
    public void cookiesKabulEdilir() {
        qDemypage.cookies.click();
    }

    @Then("email kutusuna {string} yazar")
    public void email_kutusuna_yazar(String istenenUserName) {
        qDemypage.emailloginElementi.sendKeys(ConfigReader.getProperty(istenenUserName));
    }
    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String istenenPassword) {
        qDemypage.paswordElementi.sendKeys(ConfigReader.getProperty(istenenPassword));
    }
    @When("login butonuna basar")
    public void login_butonuna_basar() {
        qDemypage.ikinciloginElementi.click();
    }

    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(qDemypage.emailloginElementi.isDisplayed());

    }


}
