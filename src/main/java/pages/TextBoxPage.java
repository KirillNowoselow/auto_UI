package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {
    public TextBoxPage(){
        open("https://demoqa.com/text-box");
    }
    private final SelenideElement fullName = $x("//input[@id='userName']");
    private final SelenideElement email = $x("//input[@id='userEmail']");
    private final SelenideElement currentAddress = $x("//textarea[@id='currentAddress']");
    private final SelenideElement permanentAddress = $x("//textarea[@id='permanentAddress']");
    private final SelenideElement submitButton = $x("//button[@id='submit']");
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
        submitButton.click();
    }

    public Map<String, String> getOutPutData(){
        Map<String, String> data = new HashMap<>();
        for (SelenideElement outputElement : outputElements) {
            String element = outputElement.getText();
            int index = element.indexOf(":");
            data.put(element.substring(0, index).replaceAll("\\s", ""),element.substring(index + 1));
        }
        return data;
    }
}
