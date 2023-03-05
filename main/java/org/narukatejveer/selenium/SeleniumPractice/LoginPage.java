package org.narukatejveer.selenium.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver chromedriver ;
	
	public LoginPage(WebDriver chromedriver){
		this.chromedriver = chromedriver ;
	 PageFactory.initElements(chromedriver, this);
	}
	
	@FindBy(id ="login1")
	private WebElement login ;
	
	@FindBy(id="password")
	private WebElement password ;
	
	@FindBy(xpath="//input[@value='Sign in']")
	private WebElement SignIn ;
	
	@FindBy(xpath ="//b ")
	private WebElement error ;
	
	public void giveName (String Name ) {
		login.sendKeys(Name);
	}
	
	public void givePassword (String Password ) {
		password.sendKeys(Password);
	}
	
	public void clickOnSignIn () {
		SignIn.click();
	}
	public void showError() {
		error.getText() ;
	}
}
