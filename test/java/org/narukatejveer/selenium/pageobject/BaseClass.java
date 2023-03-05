package org.narukatejveer.selenium.pageobject;

import org.narukatejveer.selenium.SeleniumPractice.LoginPage;
import org.narukatejveer.selenium.SeleniumPractice.createAccount;
import org.testng.annotations.Test;

public class BaseClass extends App {
	@Test
	public void fillForm() {
		LoginPage loginPage = new LoginPage(chromedriver);
		loginPage.giveName("Tejveer Singh Naruka");
		loginPage.givePassword("Naruka@123");
		loginPage.clickOnSignIn();
		loginPage.showError();
	}
	@Test
	public void  fillRegistration() {
		createAccount account = new createAccount(chromedriver) ;
		account.clickCreateAccount();
		account.giveName("Tejveer Singh Naruka");
		account.giveId("naruka_1");
		account.checkAvailability();
		account.givePassword("Naruka@123");
		account.reTypePassword("Naruka@123");
		account.clickCheck();
		account.enterMobileNo("7412864208");
        account.choiceGender();
        account.choiceCountry("India");
        account.cityName("Jaipur");
        account.choiceGender();
        account.fillTextShow();
	}
}


