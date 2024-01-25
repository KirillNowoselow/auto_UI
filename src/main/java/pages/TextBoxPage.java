package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
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


    public SelenideElement inputFullName(String value) {
        return fullName.setValue(value);
    }
    public SelenideElement inputEmail(String value) {
        return email.setValue(value);
    }
    public SelenideElement inputCurrAddress(String value){
        return currentAddress.setValue(value);
    }
    public SelenideElement inputPermAddress(String value){
        return permanentAddress.setValue(value);
    }
    public void submitButtonClick(){
        submitButton.click();
    }

    public ArrayList<String> getOutPutData(){
        ArrayList<String> data = new ArrayList<>();

        for(int i=0;i<outputElements.size();i++){
            String element = outputElements.get(i).getText();
            int index = element.indexOf(":");
            data.add(element.substring(index+1));
        }
        return data;
    }
}
