package stepDefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import javax.security.auth.login.AccountException;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import net.masterthought.cucumber.json.Tag;
import pageObjectModel.Accounts;
import pageObjectModel.BulkEmails;
import pageObjectModel.Campaigns;
import pageObjectModel.Contacts;
import pageObjectModel.Dashboard;
import pageObjectModel.Forecast;
import pageObjectModel.Households;
import pageObjectModel.Leads;
import pageObjectModel.LoginPage;
import pageObjectModel.MyWork;
import pageObjectModel.Operators;
import pageObjectModel.Opportunities;
import pageObjectModel.Organizations;
import pageObjectModel.PartnerDashboard;
import pageObjectModel.Partners;
import pageObjectModel.Pulse;
import pageObjectModel.Reports;
import pageObjectModel.Tags;
import pageObjectModel.Territories;
import pageObjectModel.Tools;

public class Steps {

	public WebDriver driver;
	public LoginPage lp;
	public Dashboard Db;
	public PartnerDashboard Pdb;
	public MyWork Mw;
	public Pulse P;
	public Tags T;
	public BulkEmails Be;
	public Organizations Oz;
	public Households Hh;
	public Accounts A;
	public Contacts C;
	public Leads L;
	public Opportunities O;
	public Forecast F;
	public Campaigns Cmp;
	public Territories To;
	public Partners Pt;
	public Operators Op;
	public Tools Tl;
	public Reports R;
	
	//BrowserStack
	//String username = System.getenv("BROWSERSTACK_USERNAME");
	//String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
	//String URL = "https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
	
	@Given("User launches Chrome browser")
	public void user_launches_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
		L = new Leads(driver);
	}
	
	@When("User opens the URL {string}")
	public void user_opens_the_url(String url) {
		driver.get(url);
	}
	
	@When("User enters the user name {string}")
	public void user_enters_the_user_name(String stext) {
		lp.username(stext);
	}
    
	@When("User enters the password {string}")
	public void user_enters_the_password(String stext) {
		lp.password(stext);
	}
    
	@When("User clicks on Login button")
	public void user_clicks_on_log_in() {
		lp.clickLogin();
	}
    
	// Dashboard feature
	@Then("User can see the Dashboard page")
	public void user_can_see_the_Dashboard_page() throws InterruptedException {
	}

	// Partner Dashboard feature
	@Then("User can see the Partner dashboard page by clicking on Partner dashboard menu")
	public void user_clicks_on_Partner_Dashboard_menu() throws InterruptedException {
	}

	// My Work feature
	@Then("User can see the My work page by clicking on My Work menu")
	public void user_clicks_on_my_work_menu() throws InterruptedException {
	}

	// Pulse feature
	@Then("User can see the Pulse page by clicking on Pulse menu")
	public void user_clicks_on_pulse_menu() throws InterruptedException {
	}

	// Tags feature
	@Then("User can see the Tags page by clicking on Tags menu")
	public void user_clicks_on_Tags_menu() throws InterruptedException {
	}

	// Bulk emails feature
	@Then("User can see the Bulk Emails page by clicking on Bulk Emails menu")
	public void user_clicks_on_Bulk_emails_menu() throws InterruptedException {
	}

	// Organizations feature
	@Then("User can see the Organizations page by clicking on Organizations menu")
	public void user_clicks_on_Organizations_menu() throws InterruptedException {
	}

	// Households feature
	@Then("User can see the Households page by clicking on Households menu")
	public void user_clicks_on_Households_menu() throws InterruptedException {
	}

	// Accounts feature
	@Then("User can see the Accounts page by clicking on Accounts menu")
	public void user_clicks_on_Accounts_menu() throws InterruptedException {
	}

	// Contacts feature
	@Then("User can see the Contacts page by clicking on Contacts menu")
	public void user_clicks_on_Contacts_menu() throws InterruptedException {
	}
    
	// Leads feature
	@Then("User clicks Continue in Protect Your Account page")
	public void user_clicks_on_Continue() throws InterruptedException {
		L.clickContinue();
		//Assert.assertEquals(lp.getPageTitle(), "User Portal");
	}
	
	@When("User enters verification code in Two Factor Preference page")
	public void user_enters_verification_code() throws InterruptedException {
		L.ipVerificationCode();
	}

	@When("User clicks Next in Two Factor Preference page")
	public void user_clicks_Next_button() throws InterruptedException {
		L.clickNext();
	}
	
	@When("User clicks on crm hyperlink")
	public void user_clicks_crm_hyperlink() throws InterruptedException {
		L.clickCRM();
	}

	@When("User clicks on Prospects")
	public void user_clicks_prospects() throws InterruptedException {
		L.clickProspects();
	}
	
	@When("User clicks on contact quick add")
	public void user_clicks_quick_add() throws InterruptedException {
		L.clickQuickAdd();
	}

	@When("User adds contact details")
	public void user_adds_contact() throws InterruptedException {
		Thread.sleep(5000);
		L.addContact();
		L.ldriver.quit();
	}

	// Opportunities feature
	@Then("User can see the Opportunities page by clicking on Opportunities menu")
	public void user_clicks_on_Opportunities_menu() throws InterruptedException {
	}

	// Forecast feature
	@Then("User can see the Forecast page by clicking on Forecast menu")
	public void user_clicks_on_Forecast_menu() throws InterruptedException {
	}

	// Campaigns feature
	@Then("User can see the Campaigns page by clicking on Campaigns menu")
	public void user_clicks_on_Campaigns_menu() throws InterruptedException {
	}

	// Territories feature
	@Then("User can see the Territories page by clicking on Territories menu")
	public void user_clicks_on_Territories_menu() throws InterruptedException {
	}

	// Partners feature
	@Then("User can see the Partners page by clicking on Partners menu")
	public void user_clicks_on_Partners_menu() throws InterruptedException {
	}

	// Operators feature
	@Then("User can see the Operators page by clicking on Operators menu")
	public void user_clicks_on_Operators_menu() throws InterruptedException {
	}

	// Tools feature
	@Then("User can see the Tools page by clicking on Tools menu")
	public void user_clicks_on_Tools_menu() throws InterruptedException {
	}

	// Reports feature
	@Then("User can see the Reports page by clicking on Reports menu")
	public void user_clicks_on_Reports_menu() throws InterruptedException {
	}
	
}
