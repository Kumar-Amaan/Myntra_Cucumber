package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import elements.Myntra_Login_elements;
import steps.Common_steps;

public class Myntra_login_Actions {
	private WebDriver driver;

	Myntra_Login_elements myntra_Login_elements;

	public Myntra_login_Actions(Common_steps common_steps) {
		this.driver = common_steps.getDriver();
		myntra_Login_elements = new Myntra_Login_elements(driver);
	}

	public void hover_Profile() throws Exception {
		myntra_Login_elements.Profile.click();

//		Actions act = new Actions(driver);
//		act.moveToElement(Profile).perform();
		Thread.sleep(2000);
//		myntra_Login_elements.Login_SignUp.click();

	}
	public void click_Login_signup() {
		myntra_Login_elements.Login_SignUp.click();
	}

	public void Enter_Phone_no(String Phone) throws Exception {
		myntra_Login_elements.Phone_no.sendKeys(Phone);
		Thread.sleep(2000);
	}

	public void click_Continue() throws Exception {
		myntra_Login_elements.Continue.click();
		Thread.sleep(2000);
	}

	public void click_Pass() throws Exception {
		myntra_Login_elements.Click_Password.click();
		Thread.sleep(2000);
	}

	public void enter_pass(String Pass) {
		myntra_Login_elements.EnterPass.sendKeys(Pass);

	}

	public void Click_Login() throws Exception {
		myntra_Login_elements.LoginBtn.click();
		Thread.sleep(2000);
	}
}
