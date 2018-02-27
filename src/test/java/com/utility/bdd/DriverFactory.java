package com.utility.bdd;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class DriverFactory {

	public static WebDriver driver;

	public static WebDriver initialize(String browser) {

		if (browser.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}

		else if (browser.equalsIgnoreCase("Chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			// Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}

		else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static WebElement waitForElementDisplayed(WebElement elem) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.visibilityOf(elem));

	}

	public static String getTitle() {
		return driver.getTitle();
	}

	public static void openURL(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void destroyDriver() {
		driver.quit();
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void clearBrowserCache() throws InterruptedException {
		driver.manage().deleteAllCookies(); // delete all cookies
		Thread.sleep(2000); // wait 2 seconds to clear cookies.
	}
		
	/*public static void SwitchToWindow(String handle) {

		// Switches to another window
		driver.switchTo().window(handle);
	}

	public static void SwitchToFrame(String handle) {

		// switches to a different frame
		driver.switchTo().frame(handle);
	}

	public static void SwitchToFramesByIndex(int FrameIndex) {
		driver.switchTo().frame(FrameIndex);
	}

	public static void RefreshPage() {
		driver.navigate().refresh();
	}

	public static void Back() {
		driver.navigate().back();
	}

	public static WebElement waitForElement(WebElement elem) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.elementToBeClickable(elem));

	}

*/

	/*
	 * public static String waitForAllLinks(String item) { WebDriverWait wait =
	 * new WebDriverWait(driver, 30);
	 * wait.until(ExpectedConditions.elementToBeClickable(By.tagName(item)));
	 * return item; }
	 */

	/*
	 * public static void MouseHoverAction(String MainElementText, String
	 * subElementText, String Message) throws InterruptedException { WebElement
	 * element = driver.findElement(By.cssSelector(MainElementText)); Actions
	 * action = new Actions(driver); action.moveToElement(element).perform();
	 * WebElement subElement = driver.findElement(By.linkText(subElementText));
	 * action.moveToElement(subElement); action.click(); action.perform(); }
	 */

	/*
	 * public static void Scroll() { JavascriptExecutor jse =
	 * (JavascriptExecutor) driver; jse.executeScript("window.scrollBy(0,500)",
	 * ""); }
	 */


}