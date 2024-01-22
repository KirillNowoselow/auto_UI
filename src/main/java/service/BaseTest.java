package service;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.codeborne.selenide.Configuration;


public class BaseTest {
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }

    public void init(){
        setUp();
    }

}
