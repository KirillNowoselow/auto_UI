package steps;

import io.qameta.allure.Step;
import org.testng.Assert;
import pages.checkBoxPage.CheckBoxPage;

public class CheckBoxPageSteps {
    @Step("Выбор всех checkBox")
    public void allCheckBoxSelection(CheckBoxPage checkBoxPage){
        checkBoxPage.checkBoxFrame.openAllCheckBoxes();
        checkBoxPage.checkBoxFrame.clickCheckBoxHome();
        Assert.assertEquals(checkBoxPage.checkBoxFrame.getResultsTitlesList(), checkBoxPage.checkBoxFrame.getSelectedCheckBoxes());
        System.out.println(checkBoxPage.checkBoxFrame.getResultsTitlesList());
        System.out.println(checkBoxPage.checkBoxFrame.getSelectedCheckBoxes());
    }
}
