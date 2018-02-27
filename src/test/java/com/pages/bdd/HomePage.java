package com.pages.bdd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.bdd.DriverFactory;

public class HomePage {

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

	public HomePage() {

		try {
			PageFactory.initElements(DriverFactory.driver, this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isLogoDisplayed() {
		return logo.isDisplayed();
	}

	public void pressRightArrow() {
		rightArrow.click();
	}

	public void pressLeftArrow() {
		leftArrow.click();
	}

	public void waitUntilFindOutMoreIsDisplayed() {
		DriverFactory.waitForElementDisplayed(findOutMore);
	}

	public boolean is_FindOutMore_Slide_Displayed() {
		return findOutMore.isDisplayed();
	}

	public void waitUntilSignUpIsDisplayed() {
		DriverFactory.waitForElementDisplayed(signUp);
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

	/*
	 * public void select_Report_From_Dropdown() { reportMisconduct.click(); }
	 * 
	 * public void select_GlobalContacts_From_Dropdown() {
	 * globalContacts.click(); }
	 * 
	 * public void select_ContactsAndOfficesWorldwide_From_Dropdown() {
	 * contactsAndOfficesWorldwide.click(); }
	 * 
	 * public void select_mainOffices_From_Dropdown() { mainOffices.click(); }
	 * 
	 * public void select_localContact_From_Dropdown() { localContact.click(); }
	 */
}
