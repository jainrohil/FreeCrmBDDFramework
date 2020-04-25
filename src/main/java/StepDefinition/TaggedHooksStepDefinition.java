package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDefinition {
	//Execution order --
	//1. @Before
	//2. @Before("@First")
	//3. Given --> When --> Then
	//4. @After
	//5. @After("@First")
	
	
	//Global hooks
	@Before(order=0)
	public void setUpp() {
		System.out.println("Setup browser");
		System.out.println("Launch browser");
	}
	
	@After(order=0) void tearDownn() {
		System.out.println("Close the browser");
	}
	
	
	//Case when there are multiple Global hooks -- user 'order' option
	@Before(order=1)
	public void setUpp1() {
		System.out.println("Setup browser order=1");
		System.out.println("Launch browser order=1");
	}
	
	@After(order=1)
	public void tearDownn1() {
		System.out.println("Close the browser");
	}
	
	//local -- only for @First
	@Before("@First")
	public void setUpFirst() {
		System.out.println("Before for @First");
	}
	
	@After("@First")
	public void tearDownFirst() {
		System.out.println("After for @First");
	}	
	
	//local -- only for @Second
	@Before("@Second")
	public void setUpSecond() {
		System.out.println("Before for @Second");
	}
	
	@After("@Second")
	public void tearDownSecond() {
		System.out.println("After for @Second");
	}
	
	
	//local -- only for @Third
	@Before("@Third")
	public void setUpThird() {
		System.out.println("Before for @Third");
	}
	
	@After("@Third")
	public void tearDownThird() {
		System.out.println("After for @Third");
	}
	
	@Given("^user is on the deals page -taggedhooks$")
	public void user_is_on_the_deals_page_taggedhooks() throws Throwable {
		System.out.println("Given 1");
	}

	@When("^Use fills the deal details -taggedhooks$")
	public void use_fills_the_deal_details_taggedhooks() throws Throwable {
		System.out.println("When 1");
	}

	@Then("^deal is created -taggedhooks$")
	public void deal_is_created_taggedhooks() throws Throwable {
		System.out.println("Then 1");
	}

	@Given("^user is on the contactss page -taggedhooks$")
	public void user_is_on_the_contactss_page_taggedhooks() throws Throwable {
		System.out.println("Given 2");
	}

	@When("^Use fillss the contacts details -taggedhooks$")
	public void use_fillss_the_contacts_details_taggedhooks() throws Throwable {
		System.out.println("When 2");
	}

	@Then("^contact is created -taggedhooks$")
	public void contact_is_created_taggedhooks() throws Throwable {
		System.out.println("Then 2");
	}

	@Given("^user is on the case page -taggedhooks$")
	public void user_is_on_the_case_page_taggedhooks() throws Throwable {
		System.out.println("Given 3");
	}

	@When("^Use fillss the case details -taggedhooks$")
	public void use_fillss_the_case_details_taggedhooks() throws Throwable {
		System.out.println("When 3");
	}

	@Then("^case is created -taggedhooks$")
	public void case_is_created_taggedhooks() throws Throwable {
		System.out.println("Then 3");
	}


}
