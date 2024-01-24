package config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;

public class Driver {
    public void initDriver(){
        TestConfig.initConfig();
    }
    public static WebDriver currentDriver() {
        return WebDriverRunner.getWebDriver();
    }
    public void open(String url) {
        Selenide.open(url);
    }

    public void close() {
        currentDriver().quit();
    }
}
