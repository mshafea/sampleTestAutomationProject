package com.steps.bdd;

import java.io.File;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.utility.bdd.PropertyReader;

public class DriverFactory {

	public static WebDriver driver;
	public static PropertyReader prop;

	public static WebDriver startDriver(String browser) {

		if (browser.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + File.separator + "resources" + File.separator + "geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("Chrome"))

		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "resources"
					+ File.separator + "chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + File.separator + "resources"
					+ File.separator + "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}


	public static void stopDriver() {
		driver.quit();
	}
}