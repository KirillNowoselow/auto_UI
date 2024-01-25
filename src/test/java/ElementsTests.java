import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ElementsPage;
import pages.MainPage;
import pages.TextBoxPage;
import utils.RandomGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ElementsTests {

    @Test
    public void test() throws InterruptedException {
//        MainPage mainPage = new MainPage();
//        ElementsPage elementsPage = mainPage.goToElements();
//        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),"https://demoqa.com/elements");
//
//        TextBoxPage textBoxPage = elementsPage.goToTextBox();
//        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),"https://demoqa.com/text-box");
        TextBoxPage textBoxPage = new TextBoxPage();
        String name = RandomGenerator.generateRandomString(8);
        String email = RandomGenerator.generateRandomEmail();
        String currAddress = RandomGenerator.generateRandomString(10);
        String permAddress = RandomGenerator.generateRandomString(10);

        textBoxPage.inputFullName(name);
        textBoxPage.inputEmail(email);
        textBoxPage.inputCurrAddress(currAddress);
        textBoxPage.inputPermAddress(permAddress);
        textBoxPage.submitButtonClick();
        ArrayList<String> data = textBoxPage.getOutPutData();
        Assert.assertEquals(data.get(0), name);

        System.out.println(data);
        Thread.sleep(5000);
    }
}
