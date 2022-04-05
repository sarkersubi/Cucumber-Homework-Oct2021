package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.Accounts;
import pages.BankandCash;
import pages.LoginPage;
import pages.TestBase;

public class Stepdefinition extends TestBase {
	LoginPage loginpage;
	BankandCash bankandcash;
	Accounts accounts;

	@Before
	public void beforeRun() {
		init();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the Techfios login page$")
	public void user_is_on_the_techfios_log_in_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("^User enters the username \"([^\"]*)\"$")
	public void user_enters_the_username(String username)  {
		loginpage.enterusername(username);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@When("^User enters the password \"([^\"]*)\"$")
	public void user_enters_the_password(String password)  {
		loginpage.enterpassword(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@When("^User clicks on signinButton \"([^\"]*)\"$")
	public void user_clicks_on_signinButton(String arg1)  {
		loginpage.clicksignin();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() throws Throwable {
		Assert.assertEquals("Dashboard- iBilling", loginpage.getpagetitle());
		takeScreenshot(driver);
	}

	@Then("^User clicks on bankcash \"([^\"]*)\"$")
	public void user_clicks_on_bankcash(String bankcash)  {
		bankandcash = PageFactory.initElements(driver, BankandCash.class);
		bankandcash.clickbankandcash();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^User clicks on new account \"([^\"]*)\"$")
	public void user_clicks_on_new_account(String arg1)  {
		bankandcash.clicknewaccount();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}

	}

	@Then("^User enters \"([^\"]*)\" in accounts page$")
	public void user_enters_in_accounts_page(String element)  {
		accounts = PageFactory.initElements(driver, Accounts.class);
		accounts.accountdetails(driver);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Then("^User clicks on \"([^\"]*)\"$")
	public void user_clicks_on()  {
		accounts.clickbutton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully() throws Throwable {
		// Assert.assertEquals("Manage Accounts", accounts.accountdetails(driver) );
		takeScreenshot(driver);
	}

	@After
	public void teardown() {

		driver.close();
		driver.quit();

	}
}