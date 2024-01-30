package elements.basic;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Input extends BaseElement{
    public Input(SelenideElement container) {
        super(container);
    }

    public Input(String name, String fieldName){
        this($x("//input[@id='"+name+"']").as("Поле: "+fieldName));
    }

    public Input(SelenideElement container, String fieldName){
        this(container.$x(".//div[.='"+fieldName+"']//input").as("Поле: "+fieldName));
    }

    public void setValue(String value){
        container.shouldBe(Condition.visible).setValue(value);
    }
    public void setValue(int value){
        container.shouldBe(Condition.visible).setValue(String.valueOf(value));
    }
    public void clear(){
        container.clear();
    }
}
