package com.steps.bdd;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.utility.bdd.PropertyReader;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class TestBase extends DriverFactory{

	PropertyReader prop = new PropertyReader();

	@Before("@ie")
	public void launchInternetExplorer() {
		DriverFactory.startDriver("ie");
	}

	@Given("^user is on home page$")
	public void user_is_on_home_page() throws ParserConfigurationException, SAXException, IOException, InterruptedException {
		driver.get(prop.readProperty("url"));
	}
	
	@After("@ie")
	public void ieTearDown() {
		DriverFactory.stopDriver();

}
}
