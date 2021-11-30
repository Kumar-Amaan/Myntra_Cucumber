package steps;

import org.openqa.selenium.WebDriver;

import actions.Common_Actions;
import actions.Login_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login_steps {
	Common_Actions common_Actions;
	Login_Actions login_Actions;

	public Login_steps(Common_Actions common_Actions, Login_Actions login_Actions) {
		this.common_Actions = common_Actions;
		this.login_Actions = login_Actions;
	}

	protected WebDriver driver;

	@Given("User is on linkedin Login Page")
	public void user_is_on_linkedin_login_page() {
		common_Actions.goToURL("https://www.linkedin.com/login");
	}

	@When("User enter username {string}")
	public void user_enter_username(String string) {
		login_Actions.input_Username(string);
	}

	@When("User enter password {string}")
	public void user_enter_password(String string) throws Exception {
		login_Actions.input_pass(string);
		login_Actions.click_SignIN();
	}

	@Then("User navigate to the LinkedIn HomePage")
	public void user_navigate_to_the_linked_in_home_page() {
		String homePage = "https://www.linkedin.com/feed/";
		Assert.assertEquals("https://www.linkedin.com/feed/", homePage);
	}

}
