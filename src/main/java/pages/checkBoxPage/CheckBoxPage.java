package pages.checkBoxPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import elements.basic.CheckBox;
import pages.checkBoxPage.frames.CheckBoxFrame;
import service.BaseTest;
import utils.CollectionConverter;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CheckBoxPage extends BaseTest {
    public CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
}
