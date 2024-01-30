package service;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.PageLoadStrategy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import steps.Steps;
import utils.RandomGenerator;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest implements Steps {
    protected TestConfig testConfig = ConfigFactory.create(TestConfig.class);
    protected final String name = RandomGenerator.generateRandomString(8);
    protected final String email = RandomGenerator.generateRandomEmail();
    protected final String address = RandomGenerator.generateRandomString(10);
    protected final String string = RandomGenerator.generateRandomString(10);

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.pageLoadStrategy = String.valueOf(PageLoadStrategy.NONE);
        Configuration.baseUrl = testConfig.baseUrl();
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 5000;
        Configuration.fastSetValue = true;
        Configuration.webdriverLogsEnabled = true;
        Configuration.screenshots = false;
        Configuration.headless = false;
        open("/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterMethod
    public static void tearDown() {
        Selenide.webdriver().driver().clearCookies();
        Selenide.webdriver().driver().close();
    }
}
