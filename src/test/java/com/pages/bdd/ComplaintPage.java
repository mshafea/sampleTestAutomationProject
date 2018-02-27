package com.pages.bdd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.bdd.DriverFactory;

public class ComplaintPage {

	@FindBy(css = ".pageheadline__hl")
	private WebElement header;

	public ComplaintPage() {
		try {
			PageFactory.initElements(DriverFactory.driver, this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getPageHeader() {
		String pageHeader = header.getText();
		return pageHeader;
	}

	public void waitUntilComplaintIsDisplayed() {
		DriverFactory.waitForElementDisplayed(header);
	}
}
