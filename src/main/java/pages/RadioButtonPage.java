package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RadioButtonPage {
    private final SelenideElement yesRadio = $x("//label[@for='yesRadio']");
    private final SelenideElement impressiveRadio = $x("//label[@for='impressiveRadio']");
    private final SelenideElement noRadio = $x("//label[@for='noRadio']");
    private final SelenideElement result = $x("//span[@class='text-success']");

    public void selectYesRadio(){
        yesRadio.click();
        result.getText().equals("Yes");
    }

    public void selectImpressiveRadio(){
        impressiveRadio.click();
        result.getText().equals("Imptessive");
    }

    public void selectNoRadio(){
        noRadio.getAttribute("disabled");
    }
}
