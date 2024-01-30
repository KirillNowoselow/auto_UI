package elements.basic;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public abstract class BaseElement {

    protected SelenideElement container;

    public BaseElement(SelenideElement container) {
        this.container = container;
    }

    public boolean isVisibility(){
        return container.is(Condition.visible);
    }

    public void checkVisibility(Boolean isVisible){
        if (isVisible){
            container.shouldBe(Condition.visible);
        }else {
            container.shouldNotBe(Condition.visible);
        }
    }

    public void checkEnabled(Boolean isEnable){
        if (isEnable){
            container.shouldBe(Condition.enabled);
        }else {
            container.shouldNotBe(Condition.enabled);
        }
    }

    public String getText(){return container.getText();}
    public String getValue(){return container.getValue();}

}
