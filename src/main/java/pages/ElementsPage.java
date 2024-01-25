package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Text;
import service.BaseTest;

import static com.codeborne.selenide.Selenide.$x;

public class ElementsPage extends BaseTest {
    private final SelenideElement textBoxBtn = $x("//span[text()='Text Box']/..");

    public TextBoxPage goToTextBox(){
        textBoxBtn.click();
        return new TextBoxPage();
    }
}
