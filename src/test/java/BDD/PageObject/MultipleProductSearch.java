package BDD.PageObject;

import BDD.BaseClassPackege.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleProductSearch extends DriverFactory {

    @FindBy(id = "searchTerm")
    WebElement SearchTextBox;

    @FindBy(className = "_2mKaC")
    WebElement magnifierGlass;

    public void multipleSearch(String item){
        SearchTextBox.sendKeys(item);
        magnifierGlass.click();
    }


}
