package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.Driver;
import config.TestConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.pageLoadStrategy = String.valueOf(PageLoadStrategy.NONE);
        Configuration.browserSize = "1920x1080";
    }

    @AfterMethod
    public void tearDown(){
        Selenide.webdriver().driver().close();
    }
}
