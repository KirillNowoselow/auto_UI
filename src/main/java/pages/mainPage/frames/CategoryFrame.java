package pages.mainPage.frames;

import com.codeborne.selenide.SelenideElement;
import pages.elementsPage.ElementsPage;

import static com.codeborne.selenide.Selenide.$x;

public class CategoryFrame {
    private final SelenideElement elementsBtn = $x("//h5[text()='Elements']//ancestor::div[@class='card mt-4 top-card']");

    public ElementsPage goToElementsPage() {
        elementsBtn.click();
        return new ElementsPage();
    }
}
