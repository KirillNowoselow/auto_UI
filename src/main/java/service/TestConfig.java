package service;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.PageLoadStrategy;

public class TestConfig {
    public static String browser = "chrome";
    private static final String baseUrl = "https://demoqa.com/";
    public static void initConfig() {
        browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
        Configuration.baseUrl = baseUrl;
        Configuration.pageLoadStrategy = String.valueOf(PageLoadStrategy.NONE);
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 5000;
        Configuration.holdBrowserOpen = false;
        Configuration.fastSetValue = true;
        Configuration.webdriverLogsEnabled = true;
        Configuration.screenshots = false;
        Configuration.headless = false;
    }
}
