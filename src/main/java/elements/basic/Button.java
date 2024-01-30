package elements.basic;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Button extends BaseElement{
    public Button(SelenideElement container, String buttonName) {
        super(container.as("Кнопка:"+ buttonName));
    }

    public Button(String buttonName){
        this($x("//button[.='" + buttonName +"']"), buttonName);
    }

    public void clickBtn(){
        container.shouldBe(Condition.visible).click();
    }
    public boolean isEnabled() {
        return container.isEnabled();
    }
    public boolean isDisabled() {
        return container.is(Condition.disabled);
    }

}
