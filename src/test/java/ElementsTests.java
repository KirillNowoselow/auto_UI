import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.*;
import service.BaseTest;
import utils.RandomGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ElementsTests extends BaseTest {

    private final String name = RandomGenerator.generateRandomString(8);
    private final String email = RandomGenerator.generateRandomEmail();
    private final String address = RandomGenerator.generateRandomString(10);
    private final String string = RandomGenerator.generateRandomString(10);
    @Test(description = "Тест ввода данных в textBox")
    public void textBoxTest() throws InterruptedException {
        ElementsPage elementsPage = new MainPage().goToElementsPage();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),"https://demoqa.com/elements");

        TextBoxPage textBoxPage = elementsPage.goToTextBoxPage();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),"https://demoqa.com/text-box");

        TEXT_BOX_PAGE_STEPS.fillTextBoxForm(textBoxPage, name, email, address, address);
        TEXT_BOX_PAGE_STEPS.clickSubmit(textBoxPage);

        Assert.assertEquals(textBoxPage.getOutPutData().get("Name"), name);
    }

    @Test(description = "Тест checkBox")
    public void checkBoxTest() throws InterruptedException {
        CheckBoxPage checkBoxPage = new MainPage().goToElementsPage().goToCheckBoxPage();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),"https://demoqa.com/checkbox");

        CHECK_BOX_PAGE_STEPS.allCheckBoxSelection(checkBoxPage);
        Assert.assertEquals(checkBoxPage.getResultsTitlesList(), checkBoxPage.getAllCheckBoxes());
        System.out.println(checkBoxPage.getResultsTitlesList());
        System.out.println(checkBoxPage.getAllCheckBoxes());

        CHECK_BOX_PAGE_STEPS.allCheckBoxSelection(checkBoxPage);
        CHECK_BOX_PAGE_STEPS.checkBoxSelection(checkBoxPage);
        Assert.assertEquals(checkBoxPage.getResultsTitlesList(),checkBoxPage.getSelectedCheckBoxes());
        System.out.println(checkBoxPage.getResultsTitlesList());
        System.out.println(checkBoxPage.getSelectedCheckBoxes());
    }

    @Test(description = "Тест radioButton")
    public void radioButtonTest() throws InterruptedException {
        RadioButtonPage radioButtonPage = new MainPage().goToElementsPage().goToRadioButtonPade();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(), "https://demoqa.com/radio-button");

        radioButtonPage.selectYesRadio();
        radioButtonPage.selectImpressiveRadio();
        radioButtonPage.selectNoRadio();
    }

    @Test(description = "Тест webTables")
    public void webTablesTest() throws InterruptedException {
        WebTablesPage webTablesPage = new MainPage().goToElementsPage().goToWebTablesPage();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(), "https://demoqa.com/webtables");

        WEB_TABLES_PAGE_STEPS.clickAddRecordBtn(webTablesPage);
        WEB_TABLES_PAGE_STEPS.fillRegistrationForm(webTablesPage, name, name, email, 1, 1, string);
        webTablesPage.clickSubmitBtn();
    }
}
