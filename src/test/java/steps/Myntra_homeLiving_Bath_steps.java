package steps;

import org.openqa.selenium.WebDriver;

import actions.Common_Actions;
import actions.Myntra_homeLiving_Bath_Actions;
import actions.Myntra_homeLiving_HomeDecor_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Myntra_homeLiving_Bath_steps {
	Common_Actions common_Actions;
	Myntra_homeLiving_Bath_Actions myntra_homeLiving_Bath_Actions;
	Myntra_homeLiving_HomeDecor_Actions myntra_homeLiving_HomeDecor_Actions;

	public Myntra_homeLiving_Bath_steps(Common_Actions common_Actions,
			Myntra_homeLiving_Bath_Actions myntra_homeLiving_Bath_Actions,
			Myntra_homeLiving_HomeDecor_Actions myntra_homeLiving_HomeDecor_Actions) {
		this.common_Actions = common_Actions;
		this.myntra_homeLiving_Bath_Actions = myntra_homeLiving_Bath_Actions;
		this.myntra_homeLiving_HomeDecor_Actions = myntra_homeLiving_HomeDecor_Actions;
	}

	protected WebDriver driver;

//	@Given("User is on Myntra Home Page")
//	public void u_ser_is_on_myntra_home_page() {
//		common_Actions.goToURL("https://www.myntra.com/");
//		common_Actions.maximize();
//	}

	@When("User hover on Home&Living and select Bath Towels")
	public void user_hover_on_home_living_and_select_bath_towels() throws Exception {
		myntra_homeLiving_Bath_Actions.hover_click_BathTowels();
	}

	@When("User navigate to the Bath Towels Page")
	public void user_navigate_to_the_bath_towels_page() {
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String BathTowel_Url = "https://www.myntra.com/towels";
		Assert.assertEquals(Url, BathTowel_Url);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Towel - Buy Towels Online at Best Price in India | Myntra";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
	}

	@When("User  select Hand&Face Towels")
	public void user_select_hand_face_towels() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		myntra_homeLiving_Bath_Actions.hover_click_Hand_Face_Towels();
	}

	@When("User navigate to the Hand&Face Towels Page")
	public void user_navigate_to_the_hand_face_towels_page() {
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String Hand_towel_Url = "https://www.myntra.com/hand-towels";
		Assert.assertEquals(Url, Hand_towel_Url);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Hand Towels - Buy Hand Towel Set Online Store | Myntra";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
	}

	@When("User  select Beach Towel")
	public void user_select_beach_towel() throws Exception {
		myntra_homeLiving_Bath_Actions.hover_click_BeachTowels();
	}

	@When("User navigate to the Beach Towels Page")
	public void user_navigate_to_the_beach_towels_page() {
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String Beach_Url = "https://www.myntra.com/beach-towels";
		Assert.assertEquals(Url, Beach_Url);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Beach Towels - Buy Beach Towel from Top Brands Online | Myntra";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
	}

	@When("User  select Towels Set")
	public void user_select_towels_set() throws Exception {
		myntra_homeLiving_Bath_Actions.hover_click_TowelsSet();
	}

	@When("User navigate to the Towels Set Page")
	public void user_navigate_to_the_towels_set_page() {
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String Towel_Set_Url = "https://www.myntra.com/towel-set";
		Assert.assertEquals(Url, Towel_Set_Url);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Towel Sets Online  - Buy Bath & Hand Towels Sets Online at Myntra";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
	}

	@When("User select Bath Rugs")
	public void user_select_bath_rugs() throws Exception {
		myntra_homeLiving_Bath_Actions.hover_click_BathRugs();
	}

	@When("User navigate to the Bath Rugs Page")
	public void user_navigate_to_the_bath_rugs_page() {
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String Bath_Rugs_Url = "https://www.myntra.com/bath-rugs";
		Assert.assertEquals(Url, Bath_Rugs_Url);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Bathroom Rugs- Buy Bath Mats & Bath Rugs Online in India - Myntra";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
	}

	@When("User select Bath Robes")
	public void user_select_bath_robes() throws Exception {
		myntra_homeLiving_Bath_Actions.hover_click_BathRobes();
	}

	@When("User navigate to the Bath Robes Page")
	public void user_navigate_to_the_bath_robes_page() {
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String Bath_Robes_Url = "https://www.myntra.com/bath-robes";
		Assert.assertEquals(Url, Bath_Robes_Url);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Bath Robe - Buy Bath Robe Online in India | Myntra";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
	}

	@When("User select Bathroom Accessories")
	public void user_select_bathroom_accessories() throws Exception {
		myntra_homeLiving_Bath_Actions.hover_click_Bathroom_Accessories();
	}

	@Then("User navigate to the Bathroom Accessories Page")
	public void user_navigate_to_the_bathroom_accessories_page() {
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String bathroom_accessoriesUrl = "https://www.myntra.com/bathroom-accessories";
		Assert.assertEquals(Url, bathroom_accessoriesUrl);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Bathroom Accessories - Buy Bathroom Accessories Online in India | Myntra";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}

	}

	@When("User hover on Home&Living and select Plants&Planters")
	public void user_hover_on_home_living_and_select_plants_planters() throws Exception {
		myntra_homeLiving_HomeDecor_Actions.hover_click_Plants_Planters();
	}

	@When("User navigate to the Plants&Planters Page")
	public void user_navigate_to_the_plants_planters_page() {
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String Plants_Url = "https://www.myntra.com/artificial-flowers-and-plants-planters";
		Assert.assertEquals(Url, Plants_Url);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Artificial Flowers And Plants Planters - Buy Artificial Flowers And Plants Planters online in India";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
	}

	@When("User  select Aromas&Candels")
	public void user_select_aromas_candels() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		myntra_homeLiving_HomeDecor_Actions.hover_click_Aromas_Candles();
	}

	@When("User navigate to the Aromas&Candels Page")
	public void user_navigate_to_the_aromas_candels_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String Aromas_Url = "https://www.myntra.com/aroma-oil-diffusers-aroma-oils-air-freshener-handheld-air-fresheners-home-fragrances-home-fragrance-set-candles";
		Assert.assertEquals(Url, Aromas_Url);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Aroma Oil Diffusers Oils Air Freshener Handheld Fresheners Home Fragrances Fragrance Set Candles - Buy Aroma Oil Diffusers Oils Air Freshener Handheld Fresheners Home Fragrances Fragrance Set Candles online in India";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
	}

	@When("User  select Clocks")
	public void user_select_clocks() throws Exception {
		myntra_homeLiving_HomeDecor_Actions.hover_click_Clocks();
	}

	@When("User navigate to the Clocks Page")
	public void user_navigate_to_the_clocks_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String Clocks_Url = "https://www.myntra.com/clocks";
		Assert.assertEquals(Url, Clocks_Url);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Clocks - Shop for Clocks & Timekeeper Online in India | Myntra";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
	}

	@When("User  select Mirrors Set")
	public void user_select_mirrors_set() throws Exception {
		myntra_homeLiving_HomeDecor_Actions.hover_click_Mirrors();
	}

	@When("User navigate to the Mirrors Page")
	public void user_navigate_to_the_mirrors_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String Mirror_url = "https://www.myntra.com/mirrors";
		Assert.assertEquals(Url, Mirror_url);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Mirror - Buy Mirrors Online in India at Best Price | Myntra";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
	}

	@When("User select Wall Décor")
	public void user_select_wall_décor() throws Exception {
		myntra_homeLiving_HomeDecor_Actions.hover_click_Wall_Décor();
	}

	@When("User navigate to the Wall Décor Page")
	public void user_navigate_to_the_wall_décor_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String Décor_Url = "https://www.myntra.com/wall-decor";
		Assert.assertEquals(Url, Décor_Url);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Wall Decor - Buy Latest 2021 Wall Decor Products Online | Myntra";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
	}

	@When("User select Wall Shelves")
	public void user_select_wall_shelves() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		myntra_homeLiving_HomeDecor_Actions.hover_click_Wall_Shelves();
	}

	@When("User navigate to the Wall Shelves Page")
	public void user_navigate_to_the_wall_shelves_page() {
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String Shelves_Url = "https://www.myntra.com/wall-shelves";
		Assert.assertEquals(Url, Shelves_Url);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Wall Shelves - Buy Wall Shelf Online in India | Myntra";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
	}

	@When("User select Fountains")
	public void user_select_fountains() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		myntra_homeLiving_HomeDecor_Actions.hover_click_Fountains();
	}

	@Then("User navigate to the Fountains Page")
	public void user_navigate_to_the_fountains_page() {
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String fountains_Url = "https://www.myntra.com/fountains";
		Assert.assertEquals(Url, fountains_Url);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Fountains - Shop Trendy Indoor Fountains for Homes & Office | Myntra";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
	}

	@When("User select Showpieces & Vases")
	public void user_select_showpieces_vases() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		myntra_homeLiving_HomeDecor_Actions.hover_click_Showpieces_Vases();
	}

	@Then("User navigate to the Showpieces & Vases Page")
	public void user_navigate_to_the_showpieces_vases_page() {
		// Write code here that turns the phrase above into concrete
		// actionshome-decor-showpieces-vases
//		
		System.out.println("Current Page Url : " + common_Actions.getCurrentUrl());
		System.out.println("Current Title of the Page : " + common_Actions.getCurrentPageTitle());
		String Url = common_Actions.getCurrentUrl();
		String Showpieces_Url = "https://www.myntra.com/home-decor-showpieces-vases";
		Assert.assertEquals(Url, Showpieces_Url);
		String actTitle = common_Actions.getCurrentPageTitle();
		String expTitle = "Home Decor Showpieces Vases - Buy Home Decor Showpieces Vases online in India";
		if (!expTitle.equalsIgnoreCase(actTitle)) {
			System.out.println("Link navigated to the correct URL....");
		}
	}
}
