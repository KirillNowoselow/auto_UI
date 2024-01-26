package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import service.BaseTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CheckBoxPage extends BaseTest {
    private final ElementsCollection allCheckBoxes = $$x("//span[@class='rct-title']");
    private final ElementsCollection selectedCheckBoxes = $$x("//*[name()='svg' and contains(@class, 'rct-icon rct-icon-check')]/ancestor::label/span[@class='rct-title']");
    private final ElementsCollection resultTitles = $$x("//span[@class='text-success']");
    private final SelenideElement checkBoxHome = $x("//label[contains(@for, 'home')]/span[1]");
    private final SelenideElement checkBoxDesktop = $x("//label[contains(@for, 'desktop')]/span[1]");
    private final SelenideElement checkBoxWorkSpace = $x("//label[contains(@for, 'workspace')]/span[1]");
    private final SelenideElement checkBoxPrivate = $x("//label[contains(@for, 'private')]/span[1]");
    private final SelenideElement expandAllButton = $x("//button[@aria-label='Expand all']");

    public void clickCheckBoxAll(){
        expandAllButton.click();
        checkBoxHome.click();
    }

    public void clickCheckBoxDesktop(){
        expandAllButton.click();
        checkBoxDesktop.click();
    }

    public void clickCheckBoxWorkSpace(){
        expandAllButton.click();
        checkBoxWorkSpace.click();
    }

    public void clickCheckBoxPrivate(){
        expandAllButton.click();
        checkBoxPrivate.click();
    }

    public List<String> getResultsTitlesList(){
        return collectionToList(resultTitles);
    }

    public List<String> getAllCheckBoxes(){
        return collectionToList(allCheckBoxes);
    }

    public List<String> getSelectedCheckBoxes(){
        return collectionToList(selectedCheckBoxes);
    }

    public List<String> collectionToList(ElementsCollection elementsCollection){
        List<String> list = new ArrayList<>();
        for (SelenideElement element : elementsCollection){
            int index = element.getText().indexOf(".");
            if(index!=-1){
                list.add(element.getText()
                        .toLowerCase()
                        .replaceAll("\\s", "")
                        .substring(0, index-1));
            }else {
                list.add(element.getText()
                        .toLowerCase()
                        .replaceAll("\\s", ""));
            }
        }
        return list;
    }
}
