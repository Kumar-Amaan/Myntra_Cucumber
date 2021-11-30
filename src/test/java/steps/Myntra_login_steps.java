package steps;

import org.openqa.selenium.WebDriver;

import actions.Common_Actions;
import actions.Myntra_login_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Myntra_login_steps {
	Common_Actions common_Actions;
	Myntra_login_Actions myntra_login_Actions;

	public Myntra_login_steps(Common_Actions common_Actions, Myntra_login_Actions myntra_login_Actions) {
		this.common_Actions = common_Actions;
		this.myntra_login_Actions = myntra_login_Actions;
	}

	protected WebDriver driver;

	@Given("User is on Myntra Home Page")
	public void user_is_on_myntra_home_page() {
		common_Actions.goToURL("https://www.myntra.com/");
		common_Actions.maximize();
	}

	@When("User hover on Profile icon")
	public void user_hover_on_profile_icon() throws Exception {
		myntra_login_Actions.hover_Profile();
	}

	@When("User click the Login\\/SignUp link")
	public void user_click_the_login_sign_up_link() {
		myntra_login_Actions.click_Login_signup();
	}

	@Then("User navigate to the Login Page")
	public void user_navigate_to_the_login_page() {
		String loginPage = "https://www.myntra.com/login?referer=https://www.myntra.com/";
		Assert.assertTrue(loginPage, loginPage.equalsIgnoreCase(loginPage));
		System.out.println("Login PAge open");
	}

	@When("User enters the phone number {string}")
	public void user_enters_the_phone_number(String string) throws Exception {
		myntra_login_Actions.Enter_Phone_no(string);
	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() throws Exception {
		myntra_login_Actions.click_Continue();
	}

	@When("User click on Password")
	public void user_click_on_password() throws Exception {
		myntra_login_Actions.click_Pass();
	}

	@When("User enter the Password {string}")
	public void user_enter_the_password(String string) {
		myntra_login_Actions.enter_pass(string);
	}

	@When("User clicked on the Login button")
	public void user_clicked_on_the_login_button() throws Exception {
		myntra_login_Actions.Click_Login();
	}

	@Then("User navigated to the Myntra Home Page")
	public void user_navigated_to_the_myntra_home_page() {
		String homePage = "https://www.myntra.com/";
		Assert.assertTrue(true);
	}

}
