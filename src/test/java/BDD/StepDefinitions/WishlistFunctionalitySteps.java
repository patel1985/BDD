package BDD.StepDefinitions;

import BDD.PageObject.WishlistFunctionality;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishlistFunctionalitySteps {

    WishlistFunctionality obj = new WishlistFunctionality();

    @When("user clicks on Wishlist button")
    public void user_clicks_on_wishlist_button() {
        obj.clickWishlistButton();

    }
    @Then("user should be able to see his Wishlist page")
    public void user_should_be_able_to_see_his_wishlist_page() {
        obj.asstertionWishlistPage();
    }
}
