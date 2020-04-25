package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsStepDefinition {

	WebDriver driver;
	
	@Given("^User is already on the Login Page$")
	public void user_is_already_on_the_Login_Page(){
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//PageLoadTimeOut and ImplicitWait could also be defined in the config.properties file
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://ui.cogmento.com/");
	}

	@When("^Title of the Login Page is Free CRM$")
	public void title_of_the_Login_Page_is_Free_CRM(){
		String title = driver.getTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}

	@Then("^User enters the username and password$")
	public void user_enters_the_username_and_password(DataTable credentials){
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data=credentials.raw();
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get(0).get(1));
	    
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button(){
		driver.findElement(By.xpath("//div[contains(text(),'Login') and @class='ui fluid large blue submit button']")).click();
	}

	@Then("^User is on Home Page$")
	public void user_is_on_Home_Page(){
		boolean contacts=driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).isDisplayed();
	    Assert.assertEquals(contacts, true);
	}

	@Then("^User clicks on the Deal button$")
	public void user_clicks_on_the_Deal_button(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	    driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
	    
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
	}

	@Then("^User enters deal details$")
	public void user_enters_deal_details(DataTable dealData){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		List<List<String>> dealsValue=dealData.raw();
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(dealsValue.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(dealsValue.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(dealsValue.get(0).get(2));
		driver.findElement(By.xpath("//input[@name='commission']")).sendKeys(dealsValue.get(0).get(3));
	}

	@Then("^User closes the browserr$")
	public void user_closes_the_browserr(){
	   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   driver.quit();
	}
	
	
}
