package ua.mainacademy.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.mainacademy.util.TimeoutUtil;

import java.util.List;

public class EvaSearchService {
	public static WebDriver getSearchResultPage (WebDriver webDriver, String keyWord) {
		WebElement searchInput = webDriver.findElement(By.className("autocomplete__search-input input-text"));
		searchInput.sendKeys(keyWord);
		TimeoutUtil.waitSeconds(5);
		WebElement searchButton = webDriver.findElement(By.className("autocomplete__search-button"));
		searchButton.click();
		TimeoutUtil.waitSeconds(5);
		String currentUrl = webDriver.getCurrentUrl();
		webDriver.get(currentUrl);
		TimeoutUtil.waitSeconds(5);
		return webDriver;
	}

	public static WebDriver getSearchResultNextPage(WebDriver webDriver) {
		//TODO get driver with next page
		return webDriver;
	}

	public static WebDriver getItemPage(String itemCode, WebDriver webDriver) {
		List<WebElement> items = webDriver.findElements(By.className("product-badges__container"));
		String link = items.get(0)
				.findElements(By.className("product__visible-part")).get(0)
				.findElements(By.tagName("a")).get(0)
				.getAttribute("href");
		webDriver.get(link);
		TimeoutUtil.waitSeconds(5);
		return webDriver;
	}

	public static boolean isItemPresent(String itemCode, WebDriver webDriver) {
		List<WebElement> webElements = webDriver.findElements(By.cssSelector("img[src]"));
		return !webElements.isEmpty();
	}
}
