package stepDefinitions;

import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.sakshingpPage;
import utils.TestContextSetup;

public class sakshingpPageStepDefinition {
	TestContextSetup testContextSetup;
	sakshingpPage sakshingpPage;

	public sakshingpPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.sakshingpPage = testContextSetup.pageObjectManager.getLandingPage();
	}

	@Given("User is on sakshingp landing page")
	public void user_is_on_sakshingp_landing_page() {
		sakshingpPage.landingPageUrl();
		Assert.assertEquals(sakshingpPage.text, "https://sakshingp.github.io/assignment/login.html");
	}

	@When("user provides userid and password")
	public void user_provides_userid_and_password() {
		testContextSetup.common.userLogin();
	}

	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {
		sakshingpPage.homePageUrl();
		Assert.assertEquals(sakshingpPage.home, "https://sakshingp.github.io/assignment/home.html");
	}

	@Given("User is on sakshingp home page")
	public void user_is_on_sakshingp_home_page() {
		testContextSetup.common.userLogin();
		sakshingpPage.homePageUrl();
		Assert.assertEquals(sakshingpPage.home, "https://sakshingp.github.io/assignment/home.html");
	}

	@When("user clicks on amount header in transaction table then verify whether the values are sorted or not")
	public void user_clicks_on_amount_header_in_transaction_table_then_verify_whether_the_values_are_sorted_or_not() {
		sakshingpPage.amountColumnClick();
		sakshingpPage.amountValuesortCheck();
	}

}
