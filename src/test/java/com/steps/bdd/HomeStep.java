package com.steps.bdd;

import org.junit.Assert;
import com.pages.bdd.ComplaintPage;
import com.pages.bdd.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStep extends DriverFactory {

	HomePage homePage;
	ComplaintPage complaintPage;
	

	@Then("^UBS logo is displayed$")
	public void ubs_logo_is_displayed() throws Throwable {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isLogoDisplayed());
	}

	@When("^User Press on the right Arrow on the Slider$")
	public void user_press_on_the_right_arrow_on_the_slider() throws Throwable {
		homePage = new HomePage(driver);
		homePage.pressRightArrow();
	}

	@Then("^the Slider will  move to next slide$")
	public void the_slider_will_move_to_next_slide() throws Throwable {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.is_ٍٍٍSignup_Slide_Displayed());
	}

	@When("^User Press on the left arrow on the slider$")
	public void user_press_on_the_left_arrow_on_the_slider() throws Throwable {
		homePage = new HomePage(driver);
		homePage.pressLeftArrow();
	}

	@Then("^the Slider will  move back to Previous slide$")
	public void the_slider_will_move_back_to_previous_slide() throws Throwable {
		Assert.assertTrue(homePage.is_FindOutMore_Slide_Displayed());
	}

	@When("^User press on contact dropdown list and select complaint$")
	public void user_press_on_contact_dropdown_list_and_select_complaint() throws Throwable {
		homePage = new HomePage(driver);
		homePage.press_ContactList();

		// Select Complaint and feedback form from Contact dropdown list
		homePage.select_Complaint_From_Dropdown();

	}

	@Then("^complaint page is opened successfully$")
	public void complaint_page_is_oepened_successfully() throws Throwable {
		complaintPage = new ComplaintPage(driver);
		complaintPage.getPageHeader();
	}
}
