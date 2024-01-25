package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import service.BaseTest;

import static com.codeborne.selenide.Selenide.$$x;

public class CheckBoxPage extends BaseTest {
    private final ElementsCollection checkBoxes = $$x("//span[@class='rct-title']");

    private final ElementsCollection results = $$x("//span[@class='text-success']");

}
