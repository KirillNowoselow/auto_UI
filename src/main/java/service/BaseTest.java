package service;

import com.codeborne.selenide.Selenide;
import service.TestConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.Steps;

public class BaseTest implements Steps {
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        TestConfig.initConfig();
    }

    @AfterMethod
    public static void tearDown(){
        Selenide.webdriver().driver().close();
    }
}
