package steps;

import io.qameta.allure.Step;
import pages.CheckBoxPage;

public class CheckBoxPageSteps {

    public void allCheckBoxSelection(CheckBoxPage checkBoxPage){
        checkBoxPage.clickCheckBoxAll();
    }

    public void checkBoxSelection(CheckBoxPage checkBoxPage){
        checkBoxPage.clickCheckBoxDesktop();
        checkBoxPage.clickCheckBoxWorkSpace();
        checkBoxPage.clickCheckBoxPrivate();
    }
}
