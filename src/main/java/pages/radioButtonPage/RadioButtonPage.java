package pages.radioButtonPage;

import com.codeborne.selenide.SelenideElement;
import pages.radioButtonPage.frames.RadioButtonFrame;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RadioButtonPage {
    public RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
}
