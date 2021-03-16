package ua.mainacademy.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.mainacademy.util.TimeoutUtil;

import static java.util.Objects.nonNull;


public class EvaItemHandlerService {
	public static WebDriver addItemToCart(WebDriver webDriver) {
		WebElement addItemToCartButton = webDriver.findElement(By.id("product-addtocart-button"));
		if (nonNull(addItemToCartButton)) {
			addItemToCartButton.click();
			TimeoutUtil.waitSeconds(5);
		}
		return webDriver;
	}
}
