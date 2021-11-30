package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myntra_Login_elements {
	WebDriver driver;

	@FindBy(xpath = "//span[@class=\"myntraweb-sprite desktop-iconUser sprites-headerUser\"]")
	public WebElement Profile;
	@FindBy(xpath = "//a[@class=\"desktop-linkButton\"]")
	public WebElement Login_SignUp;
	@FindBy(xpath = "//input[@class=\"form-control mobileNumberInput\"]")
	public WebElement Phone_no;
	@FindBy(xpath = "//div[@class='submitBottomOption']")
	public WebElement Continue;
	@FindBy(xpath = "//span[contains(.,'Password')]")
	public WebElement Click_Password;
	@FindBy(xpath = "//input[@class=\"form-control has-feedback\"]")
	public WebElement EnterPass;
	@FindBy(xpath = "//button[@class=\"btn primary  lg block submitButton\"]")
	public WebElement LoginBtn;

	public Myntra_Login_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
