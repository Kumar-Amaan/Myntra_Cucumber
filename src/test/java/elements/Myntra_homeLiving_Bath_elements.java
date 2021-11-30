package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myntra_homeLiving_Bath_elements {
	WebDriver driver;
	@FindBy(xpath = "//a[.='Home & Living']")
	public WebElement Home_Living;
	@FindBy(xpath = "//a[.='Bath Towels']")
	public WebElement BathTowels;
	@FindBy(xpath = "//a[.='Hand & Face Towels']")
	public WebElement Hand_Face_Towels;
	@FindBy(xpath = "//a[.='Beach Towels']")
	public WebElement BeachTowels;
	@FindBy(xpath = "//a[.='Towels Set']")
	public WebElement TowelsSet;
	@FindBy(xpath = "//a[.='Bath Rugs']")
	public WebElement BathRugs;
	@FindBy(xpath = "//a[.='Bath Robes']")
	public WebElement BathRobes;
	@FindBy(xpath = "//a[.='Bathroom Accessories']")
	public WebElement Bathroom_Accessories;
	
	@FindBy(xpath = "//a[.='Plants & Planters']")
	public WebElement Plants_Planters;
	@FindBy(xpath = "//a[.='Aromas & Candles']")
	public WebElement Aromas_Candles;
	@FindBy(xpath = "//a[.='Clocks']")
	public WebElement Clocks;
	@FindBy(xpath = "//a[.='Mirrors']")
	public WebElement Mirrors;
	@FindBy(xpath = "//a[.='Wall Décor']")
	public WebElement Wall_Décor;
	@FindBy(xpath = "//a[.='Wall Shelves']")
	public WebElement Wall_Shelves;
	@FindBy(xpath = "//a[.='Fountains']")
	public WebElement Fountains;
	@FindBy(xpath = "//a[.='Showpieces & Vases']")
	public WebElement Showpieces_Vases;

	public Myntra_homeLiving_Bath_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
