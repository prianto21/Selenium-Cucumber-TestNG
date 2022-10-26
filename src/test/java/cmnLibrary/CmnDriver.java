package cmnLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CmnDriver {

	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public CmnDriver(String browserType) throws Exception {
		browserType = browserType.trim();
		if (browserType.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browserType.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserType.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			throw new Exception("invalid browser Type" + browserType);
		}
	}

	public void navigateToUrl(String url) throws Exception {
		url = url.trim();
		if (url.startsWith("http://") || url.startsWith("https://")) {
			driver.get(url);
		} else {
			throw new Exception();
		}
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
//		if(driver != null) {
//			driver.quit();
//		}
	}
	
	

}
