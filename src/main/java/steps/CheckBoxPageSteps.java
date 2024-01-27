package steps;

import io.qameta.allure.Step;
import pages.CheckBoxPage;

public class CheckBoxPageSteps {
    @Step("Выбор всех checkBox")
    public void allCheckBoxSelection(CheckBoxPage checkBoxPage){
        checkBoxPage.clickCheckBoxAll();
    }

    @Step("Выбор определенных checkBox: Desktop, WorkSpace, Private")
    public void checkBoxSelection(CheckBoxPage checkBoxPage){
        checkBoxPage.clickCheckBoxDesktop();
        checkBoxPage.clickCheckBoxWorkSpace();
        checkBoxPage.clickCheckBoxPrivate();
    }
}
