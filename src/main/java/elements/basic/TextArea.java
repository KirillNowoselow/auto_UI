package elements.basic;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TextArea extends BaseElement{
    public TextArea(SelenideElement container) {
        super(container);
    }

    public TextArea(String name, String fieldName){
        this($x("//textarea[@id='"+name+"']").as("Поле: "+fieldName));
    }

    public TextArea(SelenideElement container, String fieldName){
        this(container.$x(".//div[.='"+fieldName+"']//textarea").as("Поле: "+fieldName));
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
