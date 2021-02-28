package BDD.PageObject;

import BDD.BaseClassPackege.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IndividualProductSearch extends DriverFactory {

    @FindBy(id = "searchTerm")
    WebElement SearchTextBox;

    @FindBy(className = "_2mKaC")
    WebElement magnifierGlass;

    public void assertArgoesHomepage(){
        String expectedURL = driver.getCurrentUrl();
        Assert.assertThat(expectedURL,is("https://www.argos.co.uk/"));
    }
    public void doSearch(String item){
        SearchTextBox.sendKeys(item);
    }
    public void searchButtonClick(){
        magnifierGlass.click();
    }
    public void assertNikeProductsPage(){
        String actualURL = driver.getCurrentUrl();
        assertThat(actualURL, endsWith("nike"));

       /* WebElement header = driver.findElement(By.xpath("//*[@id=\"findability\"]/div/div[6]/div/div[5]/div[1]/h1"));//for heading
        String actualHeader = header.getText();
        Assert.assertThat(actualHeader, is("nike")); */
    }

}
