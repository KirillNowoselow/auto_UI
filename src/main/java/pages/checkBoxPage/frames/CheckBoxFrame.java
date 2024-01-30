package pages.checkBoxPage.frames;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import elements.basic.CheckBox;
import utils.CollectionConverter;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CheckBoxFrame {
    private final ElementsCollection selectedCheckBoxes = $$x("//*[name()='svg' and contains(@class, 'rct-icon rct-icon-check')]/ancestor::label/span[@class='rct-title']");
    private final ElementsCollection resultTitles = $$x("//span[@class='text-success']");
    public CheckBox home = new CheckBox("home");
    private final SelenideElement toggleHomeBtn = $x("//label[@for='tree-node-home']/..//button[@aria-label='Toggle']");
    private final SelenideElement toggleDesktopBtn = $x("//label[@for='tree-node-desktop']/..//button[@aria-label='Toggle']");
    private final SelenideElement toggleDocumentsBtn = $x("//label[@for='tree-node-documents']/..//button[@aria-label='Toggle']");
    private final SelenideElement toggleWorkSpaceBtn = $x("//label[@for='tree-node-workspace']/..//button[@aria-label='Toggle']");
    private final SelenideElement toggleOfficeBtn = $x("//label[@for='tree-node-office']/..//button[@aria-label='Toggle']");
    private final SelenideElement toggleDownloadsBtn = $x("//label[@for='tree-node-downloads']/..//button[@aria-label='Toggle']");

    public void openAllCheckBoxes(){
        toggleHomeBtn.click();
        toggleDesktopBtn.click();
        toggleDocumentsBtn.click();
        toggleDownloadsBtn.click();
        toggleWorkSpaceBtn.click();
        toggleOfficeBtn.click();
    }

    public void clickCheckBoxHome(){
        home.clickCheckBox();
    }

    public List<String> getResultsTitlesList(){
        return CollectionConverter.collectionToList(resultTitles);
    }

    public List<String> getSelectedCheckBoxes(){
        return CollectionConverter.collectionToList(selectedCheckBoxes);
    }
}
