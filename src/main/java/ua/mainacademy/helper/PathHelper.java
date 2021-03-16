package ua.mainacademy.helper;

import java.io.File;

public class PathHelper {
	public String getChromeDriverPath() {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("chromedriver").getFile());
		return file.getAbsolutePath();
	}
}