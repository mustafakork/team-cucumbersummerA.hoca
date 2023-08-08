package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Guru99Page {
    public Guru99Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h3[1]")
    public WebElement addcustomer;

    @FindBy(xpath = "//*[@for='done']")
    public WebElement done;

    @FindBy(xpath="//input[@id='fname']")
    public WebElement firstName;

    @FindBy(xpath="//input[@id='lname']")
    public WebElement lastName;

    @FindBy(xpath="//input[@id='email']")
    public WebElement email;

    @FindBy(xpath="//*[@name='addr']")
    public WebElement address;

    @FindBy(xpath="//input[@id='telephoneno']")
    public WebElement phoneNumber;

    @FindBy(xpath="//input[@type='submit']")
    public WebElement submit;
}