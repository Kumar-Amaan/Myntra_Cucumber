package actions;

import org.openqa.selenium.WebDriver;

import elements.Login_elements;
import steps.Common_steps;

public class Login_Actions {
	private WebDriver driver;
	Login_elements login_elements;

	public Login_Actions(Common_steps common_steps) {
		this.driver = common_steps.getDriver();
		login_elements = new Login_elements(driver);
	}

	public void click_username_field() {
		login_elements.userID.click();
	}

	public void input_Username(String uname) {
		login_elements.userID.sendKeys(uname);
	}

	public void click_pass_field() {
		login_elements.password.click();
	}

	public void input_pass(String pass) {
		login_elements.password.sendKeys(pass);
	}

	public void click_SignIN() throws Exception {
		login_elements.SignIn.click();
		Thread.sleep(50000);
	}
}
