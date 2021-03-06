package ua.mainacademy.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import ua.mainacademy.helper.PathHelper;
import ua.mainacademy.util.TimeoutUtil;

import java.util.concurrent.TimeUnit;

public class WebDriverService {
	public static WebDriver getWebDriver(String resource) {
		//PathHelper pathHelper = new PathHelper();
		//System.setProperty("webdriver.chrome.driver", pathHelper.getChromeDriverPath());
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.get(resource);
		TimeoutUtil.waitSeconds(3);
		return new SafariDriver();

	}
}
