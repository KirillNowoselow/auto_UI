package pages;

import com.codeborne.selenide.SelenideElement;
import service.BaseTest;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainPage extends BaseTest {
    public MainPage() throws InterruptedException {
        open("https://demoqa.com/");
        Thread.sleep(3000);
    }

    private final SelenideElement elementsBtn = $x("//div[@class='card mt-4 top-card'][1]");

    public ElementsPage goToElementsPage() {
        elementsBtn.click();
        return new ElementsPage();
    }
}
