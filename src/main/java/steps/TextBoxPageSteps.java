package steps;

import pages.TextBoxPage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TextBoxPageSteps {
    public void fillTextBoxForm(TextBoxPage textBoxPage, String name, String email, String currAddress, String permAddress){
        textBoxPage.inputFullName(name);
        textBoxPage.inputEmail(email);
        textBoxPage.inputCurrAddress(currAddress);
        textBoxPage.inputPermAddress(permAddress);
    }

    public void clickSubmit(TextBoxPage textBoxPage){
        textBoxPage.submitButtonClick();
    }
}
