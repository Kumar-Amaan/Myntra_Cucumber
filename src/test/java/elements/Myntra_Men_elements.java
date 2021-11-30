package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myntra_Men_elements {
	WebDriver driver;

	@FindBy(xpath = "//a[.='Sweatshirts']")
	public WebElement click_SweatShirts;
	@FindBy(xpath = "//img[@alt='Roadster Men Grey Melange Solid Hooded Sweatshirt']")
	public WebElement Selected_item;
	@FindBy(xpath = "//button[@class='size-buttons-show-size-chart']")
	public WebElement size_Chart;
	@FindBy(xpath = "//tr[5]//div[1]")
	public WebElement Radio_btn_XL;
	@FindBy(xpath = "//span[@class='myntraweb-sprite sizeChartWeb-modalclose sprites-modalclose']")
	public WebElement close_chart;
	@FindBy(xpath = "//div[@class='Address-address-box Address-pincode-input Address-pdp-box']/input")
	public WebElement PinCode;
	@FindBy(xpath = "//button[@class='Address-address-button']")
	public WebElement Check;
	@FindBy(xpath = "//div[.='More Sweatshirts by Roadster']")
	public WebElement More_Sweatshirt;
	@FindBy(xpath = "//label[@class='common-customRadio gender-label']")
	public WebElement Checked_boy;

	public Myntra_Men_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
