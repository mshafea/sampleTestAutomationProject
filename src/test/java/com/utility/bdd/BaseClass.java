package com.utility.bdd;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;


import org.xml.sax.SAXException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class BaseClass {

	PropertyReader prop = new PropertyReader();

	@Before("@chrome")
	public void launchChrome() {
		DriverFactory.initialize("chrome");
	}

	@Before("@firefox")
	public void launchFirefox() {
		DriverFactory.initialize("firefox");
	}
	
	@Before("@ie")
	public void launchInternetExplorer() {
		DriverFactory.initialize("ie");
	}

	@Given("^user is on home page$")
	public void user_is_on_home_page() throws ParserConfigurationException, SAXException, IOException, InterruptedException {
		DriverFactory.clearBrowserCache();
		DriverFactory.openURL(prop.readProperty("url"));
	}

	@After("@firefox")
	public void firefoxTearDown() {
		DriverFactory.destroyDriver();
	}

	@After("@chrome")
	public void chromeTearDown() {
		DriverFactory.destroyDriver();

	}
	
	@After("@ie")
	public void ieTearDown() {
		DriverFactory.destroyDriver();

	}

}
