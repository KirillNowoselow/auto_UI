package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.TestConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BasePage {
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        TestConfig.initConfig();
    }

    @AfterMethod
    public static void tearDown(){
        Selenide.webdriver().driver().close();
    }
}
