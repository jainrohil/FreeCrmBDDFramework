package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinition {

	@Before
	public void setUpp1() {
		System.out.println("Setup browserr");
		System.out.println("Launch browserr");
	}
	
	@After
	public void tearDownn1() {
		System.out.println("Close the browserr");
	}
	
	@Given("^user is on the deals page$")
	public void user_is_on_the_deals_page() throws Throwable {
		System.out.println("Given 1");
	}

	@When("^Use fills the details$")
	public void use_fills_the_details() throws Throwable {
		System.out.println("When 1");
	}

	@Then("^deal is created$")
	public void deal_is_created() throws Throwable {
		System.out.println("Then 1");
	}

	@Given("^user is on the contactss page$")
	public void user_is_on_the_contactss_page() throws Throwable {
		System.out.println("Given 2");
	}

	@When("^Use fillss the details$")
	public void use_fillss_the_details() throws Throwable {
		System.out.println("When 2");
	}

	@Then("^contact is created$")
	public void contact_is_created() throws Throwable {
		System.out.println("Then 2");
	}



}
