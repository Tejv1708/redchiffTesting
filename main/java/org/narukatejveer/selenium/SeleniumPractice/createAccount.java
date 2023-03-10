package org.narukatejveer.selenium.SeleniumPractice;

import org.narukatejveer.selenium.actions.PerformActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createAccount extends PerformActions {

	WebDriver chromedriver;

	public createAccount(WebDriver chromedriver) {
		super(chromedriver);
		this.chromedriver = chromedriver;
		PageFactory.initElements(chromedriver, this);
	}

	@FindBy(xpath = "//a[@title='Create new Rediffmail account']")
	private WebElement createAccount;

	@FindBy(xpath = "//input[@maxlength='61']")
	private WebElement Name;

	@FindBy(xpath = "//input[@onclick='javascript:UncheckAllOptions();']")
	private WebElement Id;

	@FindBy(xpath = "//input[@value='Check availability']")
	private WebElement availability;

	@FindBy(xpath = "//input[@value='Check availability']")
	private WebElement Check;

	@FindBy(id = "newpasswd")
	private WebElement password;

	@FindBy(id = "newpasswd1")
	private WebElement retypePassword;

	@FindBy(xpath = "//input[@onclick ='chk_altemailID();fieldTrack(this);']")
	private WebElement checkForNotAlternateEmail;

	@FindBy(id = "mobno")
	private WebElement mobileNo;

	@FindBy(xpath = "//input[@value='m']")
	private WebElement gender;

	@FindBy(xpath = "//select[@onchange ='showothcity();fieldTrack(this);']")
	private WebElement City;

	@FindBy(id = "country")
	private WebElement Country;

	@FindBy(xpath = "//img[@src=\"/register/tb135/tb_getimage.php?uid=1677953817&start=JTNFJTIy\"]")
	private WebElement textShown;

	@FindBy(id = "metric_iframe")
	private WebElement fillTextShown;

	@FindBy(id = "Register")
	private WebElement account;

	@FindBy(xpath = "//select [@style='width:285px;']")
	private WebElement dropDown;

	@FindBy(xpath = "//input[contains (@name , 'hinta')]")
	private WebElement enterAnswer;

	@FindBy(xpath = "//input[contains(@name , 'mother' )]")
	private WebElement mothername;

	@FindBy(xpath = "//select[@style='width:183px;']")
	private WebElement city;
	
	@FindBy(xpath ="//select [contains (@name , 'DOB_Day')]")
    private WebElement date ;
	
	@FindBy(xpath ="//select [contains (@name , 'DOB_Month')]")
	private WebElement month ;
	
	@FindBy(xpath ="//select [contains (@name , 'DOB_Year')]")
	private WebElement year ;
	
	public void clickCreateAccount() {
		doClick(createAccount);
	}

	public void giveName(String name) {
		Name.sendKeys(name);
	}

	public void giveId(String id) {
		Id.sendKeys(id);
	}

	public void checkAvailability() {
		availability.click();
	}

	public void givePassword(String pass) {
		password.sendKeys(pass);
	}

	public void reTypePassword(String rePass) {
		retypePassword.sendKeys(rePass);
	}

	public void clickCheck() {
		checkForNotAlternateEmail.click();
	}

	public void enterMobileNo(String number) {
		mobileNo.sendKeys(number);
	}

	public void choiceGender() {
		gender.click();
	}

	public void choiceCountry(String Country) {
		Scroll(Country);
	}

	public void cityName(String City) {
		Scroll(City);
	}

	public void fillTextShow() {
		fillTextShown.sendKeys(textShown.getText());
	}

	public void createAccount() {
		account.click();
	}

	public void selectdropdown(String visibleText) {
		Select dropdown = new Select(dropDown);
		dropdown.selectByVisibleText(visibleText);
	}

	public void fillEnterAnswer(String Name) {
		enterAnswer.sendKeys(Name);
	}

	public void fillMotherName(String Name) {
		mothername.sendKeys(Name);
	}

	public void selectCity(String visibleText) {
		Select dropdown = new Select(city);
		dropdown.selectByVisibleText(visibleText);

	}
	public void dateOfBirth(String Date , String Month , String Year) {
		Select dateDropDown = new Select(date) ;
		Select monthDropDown = new Select(month) ;
		Select yearDropDown = new Select(year) ;
		
		dateDropDown.selectByVisibleText(Date);
		monthDropDown.selectByVisibleText(Month);
		yearDropDown.selectByVisibleText(Year);
	}

}
