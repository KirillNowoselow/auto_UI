package pages.textBoxPage.frames;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import elements.basic.Button;
import elements.basic.Input;
import elements.basic.TextArea;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$$x;

public class FormFrame {
    public Input fullName = new Input("userName", "Имя");
    public Input email = new Input("userEmail", "Почта");
    public TextArea currentAddress = new TextArea("currentAddress", "Текущий адрес");
    public TextArea permanentAddress = new TextArea("permanentAddress", "Постоянный адрес");
    public Button submitBtn = new Button("Submit");
    private final ElementsCollection outputElements = $$x("//div[@id='output']//p");
    public void inputFullName(String value) {
        fullName.setValue(value);
    }
    public void inputEmail(String value) {
        email.setValue(value);
    }
    public void inputCurrAddress(String value){
        currentAddress.setValue(value);
    }
    public void inputPermAddress(String value){
        permanentAddress.setValue(value);
    }
    public void submitButtonClick(){
        submitBtn.clickBtn();
    }
    public ElementsCollection returnOutPutElements(){
        return outputElements;
    }
}
