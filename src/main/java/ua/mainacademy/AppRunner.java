package ua.mainacademy;

import org.openqa.selenium.WebDriver;
import ua.mainacademy.service.EvaItemHandlerService;
import ua.mainacademy.service.EvaSearchService;
import ua.mainacademy.service.WebDriverService;

public class AppRunner {
	public static void main(String[] args) {
		WebDriver webDriver = WebDriverService.getWebDriver("https://eva.ua");
		webDriver = EvaSearchService.getSearchResultPage(webDriver, "фольга алюминиевая");
		//TODO: add item code
		if (EvaSearchService.isItemPresent("", webDriver)) {
			webDriver = EvaSearchService.getItemPage("", webDriver);
			webDriver = EvaItemHandlerService.addItemToCart(webDriver);
		}
		webDriver.quit();
	}
}
