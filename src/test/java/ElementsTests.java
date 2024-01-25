import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.MainPage;
import pages.TextBoxPage;
import service.BaseTest;
import utils.RandomGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ElementsTests extends BaseTest {

    @Test(description = "Тест ввода данных в textBox ")
    public void textBoxTest() throws InterruptedException {
        MainPage mainPage = new MainPage();
        ElementsPage elementsPage = mainPage.goToElements();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),"https://demoqa.com/elements");

        TextBoxPage textBoxPage = elementsPage.goToTextBox();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),"https://demoqa.com/text-box");

        String name = RandomGenerator.generateRandomString(8);
        String email = RandomGenerator.generateRandomEmail();
        String currAddress = RandomGenerator.generateRandomString(10);
        String permAddress = RandomGenerator.generateRandomString(10);

        TEXT_BOX_PAGE_STEPS.fillTextBoxForm(textBoxPage, name, email, currAddress, permAddress);
        TEXT_BOX_PAGE_STEPS.clickSubmit(textBoxPage);

        Assert.assertEquals(textBoxPage.getOutPutData().get("Name"), name);


        Thread.sleep(5000);
    }
}
