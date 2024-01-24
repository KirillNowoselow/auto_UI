package config;

import com.codeborne.selenide.Configuration;

public class TestConfig {
    public static String browser = "chrome";
    public static void initConfig() {
        browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = false;
    }
}
