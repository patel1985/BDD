package BDD.StepDefinitions;

import BDD.PageObject.MultipleProductSearch;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleProductSearchSteps {

    MultipleProductSearch obj = new MultipleProductSearch();

    @When("user search for {string}")
    public void user_search_for(String item) {
        obj.multipleSearch(item);

    }
    @Then("user should able to see all products related to searched")
    public void user_should_able_to_see_all_products_related_to_searched() {

    }




}
