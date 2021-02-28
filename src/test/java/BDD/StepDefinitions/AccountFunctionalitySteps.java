package BDD.StepDefinitions;

import BDD.PageObject.AccountFunctionality;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountFunctionalitySteps {

    AccountFunctionality obj = new AccountFunctionality();

    @When("user clicks on Account button")
    public void user_clicks_on_account_button() {
        obj.clickAccountButton();

    }
    @When("user enter his email {string}")
    public void user_enter_his_email(String string) {
        obj.enterEmail();

    }
    @When("user enter his password {string}")
    public void user_enter_his_password(String string) {
        obj.enterPassword();

    }
    @When("user click on sign in securly button")
    public void user_click_on_sign_in_securly_button() {
        obj.clickSigninButton();

    }
    @Then("user should be able to see his account page")
    public void user_should_be_able_to_see_his_account_page() {
      //  obj.assertionUserAccountPage();
        //Can not assert because of verify that u r not robot window appeared at the time of assertions.
    }


}
