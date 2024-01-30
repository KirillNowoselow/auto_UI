package elements.basic;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CheckBox extends BaseElement{
    public CheckBox(SelenideElement container, String checkBoxName) {
        super(container.as("Чекбокс:"+ checkBoxName));
    }

    public CheckBox(String checkBoxName){
        this($x("//label[contains(@for, '" + checkBoxName +"')]/span[@class='rct-checkbox']"), checkBoxName);
    }
    public void clickCheckBox(){
        container.click();
    }
    private boolean checkCheckBoxIsClicked() {
        return container.$x(".//span[contains(@class,'Icon')]").as("Галочка в чекбоксе").isDisplayed();
    }

}
