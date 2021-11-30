package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_elements {
	WebDriver driver;
	@FindBy(xpath = "//input[@id='username']")
	public WebElement userID;
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;
	@FindBy(xpath = "//button[@class='btn__primary--large from__button--floating']")
	public WebElement SignIn;

	public Login_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
