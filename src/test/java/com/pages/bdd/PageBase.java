package com.pages.bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

	protected WebDriver driver;
	WebDriverWait wait;

	public PageBase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void waitForVisibilityOf(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
