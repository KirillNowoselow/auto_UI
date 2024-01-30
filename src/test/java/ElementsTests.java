import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.checkBoxPage.CheckBoxPage;
import pages.elementsPage.ElementsPage;
import pages.mainPage.MainPage;
import pages.radioButtonPage.RadioButtonPage;
import pages.textBoxPage.TextBoxPage;
import pages.webTadlesPage.WebTablesPage;
import service.BaseTest;

public class ElementsTests extends BaseTest {
    @Test(description = "Тест ввода данных в textBox")
    public void textBoxTest() throws InterruptedException {
        TextBoxPage textBoxPage = new MainPage().categoryFrame.goToElementsPage().elementsFrame.goToTextBoxPage();
        TEXT_BOX_PAGE_STEPS.fillTextBoxForm(textBoxPage, name, email, address);
        TEXT_BOX_PAGE_STEPS.clickSubmit(textBoxPage);
        TEXT_BOX_PAGE_STEPS.checkData(textBoxPage, name, email, address);
    }

    @Test(description = "Тест checkBox")
    public void checkBoxTest() {
        CheckBoxPage checkBoxPage = new MainPage().categoryFrame.goToElementsPage().elementsFrame.goToCheckBoxPage();
        CHECK_BOX_PAGE_STEPS.allCheckBoxSelection(checkBoxPage);

    }

    @Test(description = "Тест radioButton")
    public void radioButtonTest() {
        RadioButtonPage radioButtonPage = new MainPage().categoryFrame.goToElementsPage().elementsFrame.goToRadioButtonPade();
        RADIO_BUTTON_PAGE_STEPS.selectedRadio(radioButtonPage);
    }

    @Test(description = "Тест webTables")
    public void webTablesTest() {
        WebTablesPage webTablesPage = new MainPage().categoryFrame.goToElementsPage().elementsFrame.goToWebTablesPage();
        WEB_TABLES_PAGE_STEPS.clickAddRecordBtn(webTablesPage);
        WEB_TABLES_PAGE_STEPS.fillRegistrationForm(webTablesPage, name, name, email, 1, 1, string);
    }
}
