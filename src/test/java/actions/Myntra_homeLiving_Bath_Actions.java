package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import elements.Myntra_homeLiving_Bath_elements;
import steps.Common_steps;

public class Myntra_homeLiving_Bath_Actions {
	private WebDriver driver;
	Myntra_homeLiving_Bath_elements myntra_homeLiving_Bath_elements;

	public Myntra_homeLiving_Bath_Actions(Common_steps common_steps) {
		this.driver = common_steps.getDriver();
		myntra_homeLiving_Bath_elements = new Myntra_homeLiving_Bath_elements(driver);
	}

	public void hover_click_BathTowels() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.BathTowels.click();

	}
	public void hover_click_Hand_Face_Towels() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.Hand_Face_Towels.click();

	}

	public void hover_click_BeachTowels() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.BeachTowels.click();

	}

	public void hover_click_TowelsSet() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.TowelsSet.click();

	}

	public void hover_click_BathRugs() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.BathRugs.click();

	}

	public void hover_click_BathRobes() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.BathRobes.click();

	}

	public void hover_click_Bathroom_Accessories() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.Bathroom_Accessories.click();

	}

}
