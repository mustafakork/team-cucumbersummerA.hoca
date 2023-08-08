package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Guru99Page;
import utilities.Driver;

public class Guru99StepDefinitions {
    Guru99Page guru99Page =new Guru99Page();
    Faker faker =new Faker();





    @Then("Sayfanın title’ında Telecom yazdığını doğrulayın")
    public void sayfanın_title_ında_telecom_yazdığını_doğrulayın() {

        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle="Telecom";

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @And("Add Costumer sayfasına gidin")
    public void addCostumerSayfasınaGidin() {
        guru99Page.addcustomer.click();
        WebElement iframeelementi=Driver.getDriver().findElement(By.xpath("//iframe[@id='google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0']"));
        Driver.getDriver().switchTo().frame(iframeelementi);
        Driver.getDriver().findElement(By.id("dismiss-button")).click();



    }

    @And("formu doldurup müşteri  ekler")
    public void formuDoldurupMüşteriEkler() {

        guru99Page.done.click();
        guru99Page.firstName.sendKeys(faker.name().firstName());
        Actions actions  =new Actions(Driver.getDriver());
        actions.click(guru99Page.lastName).sendKeys(faker.name().lastName());
        actions.sendKeys(Keys.TAB);
        actions.sendKeys("mk@gmail.com");
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(faker.address().city());
        actions.sendKeys(Keys.TAB);
        actions.sendKeys("445511665588");
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.ENTER).perform();


    }
}
