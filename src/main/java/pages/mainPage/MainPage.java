package pages.mainPage;

import com.codeborne.selenide.SelenideElement;
import pages.elementsPage.ElementsPage;
import pages.mainPage.frames.CategoryFrame;
import service.BaseTest;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainPage extends BaseTest {
    public CategoryFrame categoryFrame = new CategoryFrame();
}
