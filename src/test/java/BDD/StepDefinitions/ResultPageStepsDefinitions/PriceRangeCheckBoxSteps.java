package BDD.StepDefinitions.ResultPageStepsDefinitions;

import BDD.BaseClassPackege.DriverFactory;
import BDD.PageObject.PriceRangeCheckBox;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PriceRangeCheckBoxSteps  {

    PriceRangeCheckBox obj = new PriceRangeCheckBox();

    @Given("user is on the ResultPage of Argoes website")
    public void user_is_on_the_result_page_of_argoes_website() {


    }
    @When("user clicks on £{int} to £{int} price range checkbox")
    public void user_clicks_on_£_to_£_price_range_checkbox(Integer int1, Integer int2) {
        obj.priceCheckBox();

    }
    @Then("user should able to see all the items within that price range")
    public void user_should_able_to_see_all_the_items_within_that_price_range() {


    }


}
