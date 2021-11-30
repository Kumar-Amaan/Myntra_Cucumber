package steps;

//import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import actions.Common_Actions;
import actions.Myntra_homeLiving_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Mynta_homeLiving_steps {
	Common_Actions common_Actions;
	Myntra_homeLiving_Actions myntra_homeLiving_Actions;

	public Mynta_homeLiving_steps(Common_Actions common_Actions, Myntra_homeLiving_Actions myntra_homeLiving_Actions) {
		this.common_Actions = common_Actions;
		this.myntra_homeLiving_Actions = myntra_homeLiving_Actions;
	}

	protected WebDriver driver;

	@Given("USer is on Myntra Home Page")
	public void u_ser_is_on_myntra_home_page() {
		common_Actions.goToURL("https://www.myntra.com/");
		common_Actions.maximize();
	}

	@When("User hover on Home&Living and select Floor lamps")
	public void user_hover_on_home_living_and_select_floor_lamps() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		myntra_homeLiving_Actions.hover_HOME_Living_click_Flamps();
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String FloorUrl = "https://www.myntra.com/floorlamp";
		Assert.assertEquals(Url, FloorUrl);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Floorlamp - Buy Floorlamp online in India";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}

	}

	@When("User  select Ceiling lamps")
	public void user_select_ceiling_lamps() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		myntra_homeLiving_Actions.hover_HOME_Living_click_Ceilinglamps();
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String FloorUrl = "https://www.myntra.com/ceilinglamp";
		Assert.assertEquals(Url, FloorUrl);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Ceilinglamp - Buy Ceilinglamp online in India";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}

	}

	@When("User  select Table lamps")
	public void user_select_table_lamps() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		myntra_homeLiving_Actions.hover_HOME_Living_click_Tablelamps();
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String FloorUrl = "https://www.myntra.com/tablelamp";
		Assert.assertEquals(Url, FloorUrl);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Tablelamp - Buy Tablelamp online in India";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}

	}

	@When("User  select Wall lamps")
	public void user_select_wall_lamps() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		myntra_homeLiving_Actions.hover_HOME_Living_click_Walllamps();
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String FloorUrl = "https://www.myntra.com/walllamp";
		Assert.assertEquals(Url, FloorUrl);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Walllamp - Buy Walllamp online in India";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}

	}

	@When("User select Outdoor lamps")
	public void user_select_outdoor_lamps() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		myntra_homeLiving_Actions.hover_HOME_Living_click_Outdoorlamps();
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String FloorUrl = "https://www.myntra.com/outdoorlamp";
		Assert.assertEquals(Url, FloorUrl);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Outdoorlamp - Buy Outdoorlamp online in India";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}

	}

	@When("User select String lamps")
	public void user_select_string_lamps() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		myntra_homeLiving_Actions.hover_HOME_Living_click_Stringlamps();
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String FloorUrl = "https://www.myntra.com/stringlight";
		Assert.assertEquals(Url, FloorUrl);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Stringlamp - Buy Stringlamp online in India";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}

	}

	@Then("User navigate to the String lamps Page")
	public void user_navigate_to_the_string_lamps_page() {
		// Write code here that turns the phrase above into concrete actions
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Stringlamp - Buy Stringlamp online in India";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
		System.out.println("Link directed to:::--> " + actTitle);
	}

}
