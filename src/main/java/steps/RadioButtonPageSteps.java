package steps;

import io.qameta.allure.Step;
import pages.radioButtonPage.RadioButtonPage;

public class RadioButtonPageSteps {
    @Step("Нажатие и проверка радиокнопок")
    public void selectedRadio(RadioButtonPage radioButtonPage){
        radioButtonPage.radioButtonFrame.selectYesRadio();
        radioButtonPage.radioButtonFrame.selectImpressiveRadio();
        radioButtonPage.radioButtonFrame.selectNoRadio();
    }
}
