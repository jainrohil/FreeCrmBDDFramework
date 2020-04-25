package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactsStepDefinition {

//	WebDriver driver;
//	
//	@Given("^User is already on Login Page$")
//	public void user_is_already_on_Login_Page(){
//		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		//PageLoadTimeOut and ImplicitWait could also be defined in the config.properties file
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.get("https://ui.cogmento.com/");
//	}
//
//	@When("^Title of Login Page is Free CRM$")
//	public void title_of_Login_Page_is_Free_CRM() {
//		String title = driver.getTitle();
//		Assert.assertEquals(title, "Cogmento CRM");
//	}
//
//	@Then("^User enters \"(.*?)\" and \"(.*?)\"$")
//	public void user_enters_and(String username, String password){
//	    driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(username);
//	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
//	}
//
//	@Then("^User clicks on the login button$")
//	public void user_clicks_on_the_login_button(){
//		driver.findElement(By.xpath("//div[contains(text(),'Login') and @class='ui fluid large blue submit button']")).click();
//	}
//
//	@Then("^User is on the Home Page$")
//	public void user_is_on_the_Home_Page(){
//		boolean contacts=driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).isDisplayed();
//	    Assert.assertEquals(contacts, true);
//	}
//
//	@Then("^User clicks on Contacts button$")
//	public void user_clicks_on_Contacts_button(){
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Then("^User clicks on New button$")
//	public void user_clicks_on_New_button(){
//		
//		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
// 	    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
//	}
//
//	@Then("^user enters \"(.*?)\", \"(.*?)\" and \"(.*?)\"$")
//	public void user_enters_and(String firstname, String lastname, String position){
//		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
//		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
//		driver.findElement(By.xpath("//input[@name='position']")).sendKeys(position);
//	}
//
//	@Then("^User clicks on the Save button$")
//	public void user_clicks_on_the_Save_button(){
//		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Then("^User closes the browser$")
//	public void user_closes_the_browser(){
//	    driver.quit();
//	}


}
