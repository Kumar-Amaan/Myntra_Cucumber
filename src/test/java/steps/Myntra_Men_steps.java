package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import actions.Common_Actions;
import actions.Myntra_Men_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Myntra_Men_steps {
	Common_Actions common_Actions;
	Myntra_Men_Actions myntra_Men_Actions;

	public Myntra_Men_steps(Common_Actions common_Actions, Myntra_Men_Actions myntra_Men_Actions) {
		this.common_Actions = common_Actions;
		this.myntra_Men_Actions = myntra_Men_Actions;
	}

	protected WebDriver driver;

	@Given("User is on Myntra HomePage")
	public void user_is_on_myntra_home_page() {
		common_Actions.goToURL("https://www.myntra.com/");
		common_Actions.maximize();
	}

	@When("User hover on Men and click Sweatshirts")
	public void user_hover_on_men_and_click_sweatshirts() throws Exception {
		myntra_Men_Actions.click_SweatShirts();
	}

	@When("User Scroll Down")
	public void user_scroll_down() {
		myntra_Men_Actions.scrollDown();
	}

	@When("User select an item")
	public void user_select_an_item() throws Exception {
		myntra_Men_Actions.click_item_HM();
	}

	@When("User navigate to the new tab of that item details")
	public void user_navigate_to_the_new_tab_of_that_item_details() {
		myntra_Men_Actions.handle_Window();
	}

	@When("User click on the Size Chart")
	public void user_click_on_the_size_chart() throws InterruptedException {
		myntra_Men_Actions.click_Size_Chart();
		Thread.sleep(4000);
	}

	@When("User check the XL size")
	public void user_check_the_xl_size() throws Exception {
		myntra_Men_Actions.check_XL();
	}

	@When("User close the Chart Size")
	public void user_close_the_chart_size() throws Exception {
		myntra_Men_Actions.close_Chart();
	}

	@When("User enter the pincode {string} and click Check")
	public void user_enter_the_pincode_and_click_check(String string) throws Exception {
		myntra_Men_Actions.Enter_Pin_and_click_Check(string);
	}

	@Then("User scroll down")
	public void user_scroll_down1() throws Exception {
		myntra_Men_Actions.scroll_down1();
	}

	@Then("User select the More Sweatshirt by H&M")
	public void user_select_the_more_sweatshirt_by_h_m() throws Exception {
		myntra_Men_Actions.click_More_HM();
	}

	@Then("User checked the Boys in Filters")
	public void user_checked_the_boys_in_filters() {
		myntra_Men_Actions.click_Boys_Radiobtn();
	}

	@Then("User navigate to boys sections")
	public void user_navigate_to_boys_sections() throws Exception {
		String URL = common_Actions.getCurrentUrl();
//		Assert.assertEquals(URL,

//		Thread.sleep(3000);
		String Boys_url = "https://www.myntra.com/sweatshirts?f=Brand%3ARoadster%3A%3AGender%3Amen%20women%2Cwomen";
		Assert.assertEquals(URL, Boys_url);
	}

}
