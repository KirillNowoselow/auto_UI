package service;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.codeborne.selenide.Configuration;


public class BaseTest {
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }

    public void init(){
        setUp();
    }

    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
