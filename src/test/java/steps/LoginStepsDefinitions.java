package steps;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DatabasePage;
import page.LoginPage;
import page.TestBase;

public class LoginStepsDefinitions extends TestBase{

	WebDriver driver;
	LoginPage loginPage;
	
	@Before
	public void init() {
		initDriver();
		driver=TestBase.initDriver();
		loginPage=PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on techfios login page$")
	public void user_is_on_techfios_login_page() {
		
		driver.get("http://www.techfios.com/billing/?ng=admin/");
			
	}
	
	//Regular Exp:
	//1. \"([^\"]*)\"
	//2. \"(.*)\"

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		loginPage.enterUserName(username);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
	   loginPage.insertPassword(password);
	}

	@When("^User click on Signin button$")
	public void user_click_on_Signin_button() throws Throwable {
		loginPage.clikSigninButton();
	}

	@Then("^User should be on Dashboard page$")
	public void user_should_be_on_Dashboard_page() throws Throwable {
		String expestedTitle = "Dashboard- iBilling";
		String  actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expestedTitle , actualTitle );
		TakesScreenShot(driver);
		
	}
	
	@When("^User enters \"([^\"]*)\" from mysql database$")
	 public void User_enters_from_mysql_database(String data) throws Throwable  {
	  if(data.equalsIgnoreCase("username")) {
	   loginPage.enterUserName(DatabasePage.getData("username"));
	   Thread.sleep(4000);
	  } else if(data.equalsIgnoreCase("password")) {
	   loginPage.enterPassword(DatabasePage.getData("password"));
	   Thread.sleep(4000);
	  } else {
	   System.out.println("Unable to pull data from DB!");
	  }    
	 }
	
	@After
	public void tearDown() {
		
		driver.close();
		driver.quit();
	}

}
