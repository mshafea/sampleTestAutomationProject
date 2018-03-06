package com.pages.bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	@FindBy(css = "h1.logo")
	private WebElement logo;

	@FindBy(id = "span#menulabel-2.metanav__hl metanav__hl--firstLevel")
	private WebElement languages;

	@FindBy(css = "a.flex-next")
	private WebElement rightArrow;

	@FindBy(css = "a.flex-prev")
	private WebElement leftArrow;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section[1]/div/div/div[2]/div/ul/li[2]/div/div/a/img")
	private WebElement findOutMore;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section[1]/div/div/div[2]/div/ul/li[3]/div/div/a/img")
	private WebElement signUp;

	@FindBy(id = "contactLabel")
	private WebElement contactDropDown;

	@FindBy(linkText = "Complaint and feedback form")
	private WebElement complaint;

	@FindBy(linkText = "Report Misconduct")
	private WebElement reportMisconduct;

	@FindBy(linkText = "Global contacts")
	private WebElement globalContacts;

	@FindBy(linkText = "Contacts and offices worldwide")
	private WebElement contactsAndOfficesWorldwide;

	@FindBy(linkText = "Main offices")
	private WebElement mainOffices;

	@FindBy(linkText = "Local contact")
	private WebElement localContact;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public boolean isLogoDisplayed() {
		return logo.isDisplayed();
	}

	public void pressRightArrow() {
		waitForVisibilityOf(findOutMore);
		rightArrow.click();
		waitForVisibilityOf(signUp);
	}

	public void pressLeftArrow() {
		waitForVisibilityOf(signUp);
		leftArrow.click();
		waitForVisibilityOf(findOutMore);
	}

	public boolean is_FindOutMore_Slide_Displayed() {
		return findOutMore.isDisplayed();
	}

	public boolean is_ٍٍٍSignup_Slide_Displayed() {
		return signUp.isDisplayed();
	}

	public void press_ContactList() {
		contactDropDown.click();
	}

	public void select_Complaint_From_Dropdown() {
		complaint.click();
	}
}
