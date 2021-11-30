package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import elements.Myntra_homeLiving_elements;
import steps.Common_steps;

public class Myntra_homeLiving_Actions {
	private WebDriver driver;
	Myntra_homeLiving_elements myntra_homeLiving_elements;

	public Myntra_homeLiving_Actions(Common_steps common_steps) {
		this.driver = common_steps.getDriver();
		myntra_homeLiving_elements = new Myntra_homeLiving_elements(driver);
	}

	public void hover_HOME_Living_click_Flamps() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_elements.FloorLamps.click();
	
	}

	public void hover_HOME_Living_click_Ceilinglamps() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_elements.CeilingLamps.click();
	}

	public void hover_HOME_Living_click_Tablelamps() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_elements.TableLamps.click();
	}

	public void hover_HOME_Living_click_Walllamps() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_elements.WallLamps.click();
	}

	public void hover_HOME_Living_click_Outdoorlamps() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_elements.OutdoorLamps.click();
	}

	public void hover_HOME_Living_click_Stringlamps() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_elements.StringLamps.click();
	}
}
