package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AutoPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class AutoStepDefinitions {

    AutoPage autoPage =new AutoPage();

    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

    }
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        autoPage.anasayfasignINElementi.isDisplayed();

    }
    @And("Click on Products button")
    public void clickOnProductsButton() {
        autoPage.productButtonElementi.click();
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        autoPage.allproductYazıElementi.isDisplayed();

    }
    @Then("Enter product name in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button() {
        autoPage.productSearchKutusu.click();
        autoPage.productSearchKutusu.sendKeys("Dress"+ Keys.ENTER);
        autoPage.searchbuttonArama.click();

    }

    @And("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        int sayaç = 0;
        List<WebElement> urunlist = autoPage.searchUrunlist;
        boolean flag = false;
        for (WebElement eachurun : urunlist
        ) {

            if (eachurun.getText().contains("Dress")) ;

            flag = true;
            break;

        }


    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        List<WebElement> urunlist = autoPage.searchUrunlist;

        for (WebElement eachurun : urunlist
        ) {

            Assert.assertTrue(eachurun.isDisplayed());


        }
    }
}
