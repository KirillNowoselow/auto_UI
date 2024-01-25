package steps;

import io.qameta.allure.Step;
import pages.TextBoxPage;

public class TextBoxPageSteps {
    @Step("Заполнение формы")
    public void fillTextBoxForm(TextBoxPage textBoxPage, String name, String email, String currAddress, String permAddress){
        textBoxPage.inputFullName(name);
        textBoxPage.inputEmail(email);
        textBoxPage.inputCurrAddress(currAddress);
        textBoxPage.inputPermAddress(permAddress);
    }

    @Step("Клик на кнопку Submit")
    public void clickSubmit(TextBoxPage textBoxPage){
        textBoxPage.submitButtonClick();
    }
}
