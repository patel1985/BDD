package BDD.StepDefinitions;

import BDD.PageObject.IndividualProductSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IndividualProductSearchSteps {

    IndividualProductSearch obj = new IndividualProductSearch();

    @Given("user is on the homepage of Argoes Website")
    public void user_is_on_the_homepage_of_argoes_website() {
        obj.assertArgoesHomepage();
    }
    @When("user types Nike in the search box")
    public void user_types_nike_in_the_search_box() {
        obj.doSearch("Nike");

    }
    @When("user clicks on search button")
    public void user_clicks_on_serch_button() {
        obj.searchButtonClick();

    }
    @Then("user should be able to see all the Nike products")
    public void user_should_be_able_to_see_all_the_nike_products() {
        obj.assertNikeProductsPage();

    }

}
