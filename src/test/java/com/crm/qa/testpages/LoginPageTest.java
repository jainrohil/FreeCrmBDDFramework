package com.crm.qa.testpages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginPageTest {
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//PageLoadTimeOut and ImplicitWait could also be defined in the config.properties file
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://ui.cogmento.com/");		
	}
	
	@Test(priority = 1)
	public void LoginTest() {
		String title = driver.getTitle();
		System.out.println("title-->"+title);
		Assert.assertEquals(title, "Cogmento CRM","The title not as expected");
	}
	
	@Test(priority = 2)
	public void freeCrmSignUpTest() {
		boolean signUpBtn = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).isDisplayed();
		Assert.assertEquals(signUpBtn, false);
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		driver.quit();
	}
}
