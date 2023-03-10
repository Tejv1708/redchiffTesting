package org.narukatejveer.selenium.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PerformActions {

	WebDriver chromedriver;

	public PerformActions(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
	}

	public void Scroll(String name) {
		WebElement element = chromedriver.findElement(By.id("country"));
		Actions actions = new Actions(chromedriver);
		actions.moveToElement(element);
		actions.perform();
	}

	public void doClick(WebElement click) {
		new Actions(chromedriver).moveToElement(click).pause(Duration.ofSeconds(1)).click().build().perform();;
	}
	

}
