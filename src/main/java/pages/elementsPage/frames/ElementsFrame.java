package pages.elementsPage.frames;

import com.codeborne.selenide.SelenideElement;
import pages.checkBoxPage.CheckBoxPage;
import pages.radioButtonPage.RadioButtonPage;
import pages.textBoxPage.TextBoxPage;
import pages.webTadlesPage.WebTablesPage;

import static com.codeborne.selenide.Selenide.$x;

public class ElementsFrame {
    private final SelenideElement textBoxPage = $x("//span[text()='Text Box']/..");
    private final SelenideElement checkBoxPage = $x("//span[text()='Check Box']/..");
    private final SelenideElement radioButtonPage = $x("//span[text()='Radio Button']/..");
    private final SelenideElement webTablesPage = $x("//span[text()='Web Tables']/..");
    private final SelenideElement buttonsPage = $x("//span[text()='Buttons']/..");
    private final SelenideElement linksPage = $x("//span[text()='Links']/..");
    private final SelenideElement brokenPage = $x("//span[text()='Broken Links - Images']/..");
    private final SelenideElement uploadDownloadPage = $x("//span[text()='Upload and Download']/..");
    private final SelenideElement dynamicPropertiesPage = $x("//span[text()='Dynamic Properties']/..");


    public TextBoxPage goToTextBoxPage(){
        textBoxPage.click();
        return new TextBoxPage();
    }

    public CheckBoxPage goToCheckBoxPage(){
        checkBoxPage.click();
        return new CheckBoxPage();
    }

    public RadioButtonPage goToRadioButtonPade(){
        radioButtonPage.click();
        return new RadioButtonPage();
    }

    public WebTablesPage goToWebTablesPage(){
        webTablesPage.click();
        return new WebTablesPage();
    }
}
