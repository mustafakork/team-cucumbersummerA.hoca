package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QDemypage {
    public QDemypage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-sign-in-simple']")
    public WebElement ılklogin;

    @FindBy(xpath = "//a[text()='Accept']")
    public  WebElement cookies;

    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailloginElementi;

    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement paswordElementi;

    @FindBy(xpath = "//*[@class='btn red radius-5 mt-4 w-100']")
    public WebElement ikinciloginElementi;
}
