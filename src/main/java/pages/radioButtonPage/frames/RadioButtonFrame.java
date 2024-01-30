package pages.radioButtonPage.frames;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RadioButtonFrame {
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
