package com.pages.bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComplaintPage extends PageBase {

	@FindBy(css = ".pageheadline__hl")
	private WebElement header;

	public ComplaintPage(WebDriver driver) {
		super(driver);
	}

	public String getPageHeader() {
		waitForVisibilityOf(header);
		String pageHeader = header.getText();
		return pageHeader;
	}

}
