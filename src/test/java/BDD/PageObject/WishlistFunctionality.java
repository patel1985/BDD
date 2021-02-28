package BDD.PageObject;

import BDD.BaseClassPackege.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.core.Is.is;

public class WishlistFunctionality extends DriverFactory {

    @FindBy(linkText = "Wishlist")
    WebElement wishlistButton;



    public void clickWishlistButton(){
        wishlistButton.click();
    }
    public void asstertionWishlistPage(){
        String expectedURL = driver.getCurrentUrl();
        Assert.assertThat(expectedURL,is(endsWith("wishlist")));
    }



}
