package steps;

import io.qameta.allure.Step;
import org.testng.Assert;
import pages.textBoxPage.TextBoxPage;
import utils.CollectionConverter;

import java.util.Map;

public class TextBoxPageSteps {
    @Step("Заполнение формы")
    public void fillTextBoxForm(TextBoxPage textBoxPage, String name, String email, String address){
        textBoxPage.formFrame.inputFullName(name);
        textBoxPage.formFrame.inputEmail(email);
        textBoxPage.formFrame.inputCurrAddress(address);
        textBoxPage.formFrame.inputPermAddress(address);
    }

    @Step("Клик на кнопку Submit")
    public void clickSubmit(TextBoxPage textBoxPage){
        textBoxPage.formFrame.submitButtonClick();
    }

    @Step("Проверка соответствия данных в ответе с введенными")
    public void checkData(TextBoxPage textBoxPage, String name, String email, String address){
        Map<String, String> outPutData = CollectionConverter.collectionToMap(textBoxPage.formFrame.returnOutPutElements());
        Assert.assertEquals(outPutData.get("Name"), name);
        Assert.assertEquals(outPutData.get("Email"), email);
        Assert.assertEquals(outPutData.get("CurrentAddress"), address);
        Assert.assertEquals(outPutData.get("PermananetAddress"), address);
    }
}
