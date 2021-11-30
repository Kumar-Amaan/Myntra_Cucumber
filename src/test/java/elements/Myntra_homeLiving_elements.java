package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myntra_homeLiving_elements {
	WebDriver driver;
	@FindBy(xpath = "//a[.='Home & Living']")
	public WebElement Home_Living;
	@FindBy(xpath = "//a[.='Floor Lamps']")
	public WebElement FloorLamps;
	@FindBy(xpath = "//a[.='Ceiling Lamps']")
	public WebElement CeilingLamps;
	@FindBy(xpath = "//a[.='Table Lamps']")
	public WebElement TableLamps;
	@FindBy(xpath = "//a[.='Wall Lamps']")
	public WebElement WallLamps;
	@FindBy(xpath = "//a[.='Outdoor Lamps']")
	public WebElement OutdoorLamps;
	@FindBy(xpath = "//a[.='String Lights']")
	public WebElement StringLamps;

	public Myntra_homeLiving_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
