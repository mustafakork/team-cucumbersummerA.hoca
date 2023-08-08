package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutoPage {
    public  AutoPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    public WebElement anasayfasignINElementi;

    @FindBy (xpath = "//i [@class='material-icons card_travel']")
    public WebElement productButtonElementi;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allproductYazıElementi;

    @FindBy(xpath = "//input[@name='search']")
    public  WebElement productSearchKutusu;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement searchbuttonArama;

    @FindBy(xpath = "//div[@class='col-sm-4']")
    public List<WebElement> searchUrunlist;



}
