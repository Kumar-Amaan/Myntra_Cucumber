package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import elements.Myntra_Men_elements;
import steps.Common_steps;

public class Myntra_Men_Actions {
	private WebDriver driver;
	Myntra_Men_elements myntra_men_elements;

	public Myntra_Men_Actions(Common_steps common_steps) {
		this.driver = common_steps.getDriver();
		myntra_men_elements = new Myntra_Men_elements(driver);
	}

	public void click_SweatShirts() throws Exception {
		WebElement Men = driver.findElement(By.linkText("MEN"));
		Actions act = new Actions(driver);
		act.moveToElement(Men).perform();
		Thread.sleep(2000);
		myntra_men_elements.click_SweatShirts.click();

	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}

	public void handle_Window() {
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
			}
		}
	}

	public void click_item_HM() throws Exception {
		myntra_men_elements.Selected_item.click();
		Thread.sleep(2000);
	}

	public void click_Size_Chart() throws InterruptedException {
		myntra_men_elements.size_Chart.click();

		Thread.sleep(2000);

	}

	public void check_XL() throws Exception {
//		boolean selectSize = myntra_men_elements.Radio_btn_XL.isSelected();
//		if (selectSize == false) {
//			myntra_men_elements.Radio_btn_XL.click();
//		}
//		driver.switchTo().alert().accept();
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", myntra_men_elements.Radio_btn_XL);
//		myntra_men_elements.Radio_btn_XL.click();
		Thread.sleep(2000);
	}

	public void close_Chart() throws Exception {
		myntra_men_elements.close_chart.click();
		Thread.sleep(2000);
	}

	public void Enter_Pin_and_click_Check(String Pin) throws Exception {
		myntra_men_elements.PinCode.sendKeys(Pin);
		Thread.sleep(2000);
		myntra_men_elements.Check.click();
		Thread.sleep(2000);
	}

	public void scroll_down1() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
	}

	public void click_More_HM() throws Exception {

		myntra_men_elements.More_Sweatshirt.click();
		Thread.sleep(2000);
	}

	public void click_Boys_Radiobtn() {
//		boolean select = myntra_men_elements.Checked_boy.isSelected();
//		if (select == false) {
		myntra_men_elements.Checked_boy.click();
	}
//
//	}
}
