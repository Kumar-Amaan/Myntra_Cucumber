package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import elements.Myntra_homeLiving_Bath_elements;

import steps.Common_steps;

public class Myntra_homeLiving_HomeDecor_Actions {
	private WebDriver driver;
	Myntra_homeLiving_Bath_elements myntra_homeLiving_Bath_elements;

	public Myntra_homeLiving_HomeDecor_Actions(Common_steps common_steps) {
		this.driver = common_steps.getDriver();
		myntra_homeLiving_Bath_elements = new Myntra_homeLiving_Bath_elements(driver);
	}

	public void hover_click_Plants_Planters() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.Plants_Planters.click();

	}

	public void hover_click_Aromas_Candles() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.Aromas_Candles.click();

	}

	public void hover_click_Clocks() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.Clocks.click();

	}

	public void hover_click_Mirrors() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.Mirrors.click();

	}

	public void hover_click_Wall_Décor() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.Wall_Décor.click();

	}

	public void hover_click_Wall_Shelves() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.Wall_Shelves.click();

	}

	public void hover_click_Fountains() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.Fountains.click();

	}

	public void hover_click_Showpieces_Vases() throws Exception {
		WebElement H_Living_Link = myntra_homeLiving_Bath_elements.Home_Living;
		Actions act = new Actions(driver);
		act.moveToElement(H_Living_Link).perform();
		Thread.sleep(2000);
		myntra_homeLiving_Bath_elements.Showpieces_Vases.click();

	}
}
