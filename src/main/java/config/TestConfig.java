package config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestConfig {
    public static String browser = "chrome";
    private static final String baseUrl = "https://demoqa.com/";
    public static void initConfig() {
        browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
        Configuration.baseUrl = baseUrl;
        Configuration.pageLoadStrategy = String.valueOf(PageLoadStrategy.NONE);
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = false;
        Configuration.browserSize = "1920x1080";
    }
}
