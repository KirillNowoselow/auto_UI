package pages;

import com.codeborne.selenide.SelenideElement;
import config.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainPage extends BasePage{
    public MainPage() {
        open("https://demoqa.com/");
    }

    private final SelenideElement elementsBtn = $x("[class='card mt-4 top-card']:nth-child(1)");

    public ElementsPage goToElements(){
        elementsBtn.click();
        return new ElementsPage();
    }
}
