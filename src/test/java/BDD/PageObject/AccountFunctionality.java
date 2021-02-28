package BDD.PageObject;

import BDD.BaseClassPackege.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.core.Is.is;

public class AccountFunctionality extends DriverFactory {

    @FindBy(xpath = "//*[@id=\"haas-v2\"]/div[2]/div/div[4]/a[2]")
    WebElement accuntButton;

    @FindBy(id = "email-address")
    WebElement emailBox;

    @FindBy(id = "current-password")
    WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/section/div[2]/div[1]/div/div/div[2]/form/button")
    WebElement signInButton;

    @FindBy(xpath = "//span[contains(text(),'Hi,')]")
    String accountPage;


    public void clickAccountButton(){
        accuntButton.click();
    }
    public void enterEmail(){
        emailBox.sendKeys("chiragmechengg@yahoo.com");
    }
    public void enterPassword(){
        passwordBox.sendKeys("Harshul@23");
    }
    public void clickSigninButton(){
        signInButton.click();
    }
    public void assertionUserAccountPage(){
        String pageheading = accountPage;
        Assert.assertThat(pageheading,is("Hi,"));
    }



}
