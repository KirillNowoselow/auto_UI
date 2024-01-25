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
    private final ElementsCollection allCheckBoxTitles = $$x("//span[@class='rct-title']");
    private final ElementsCollection resultTitles = $$x("//span[@class='text-success']");
    private final SelenideElement checkBoxHome = $x("//label[contains(@for, 'home')]/span[1]");
    private final SelenideElement checkBoxDesktop = $x("//label[contains(@for, 'desktop')]/span[1]");
    private final SelenideElement checkBoxWorkSpace = $x("//label[contains(@for, 'workspace')]/span[1]");
    private final SelenideElement checkBoxWorkReact = $x("//label[contains(@for, 'react')]/span[1]");
    private final SelenideElement expandAllButton = $x("//button[@aria-label='Expand all']");

    public void clickCheckAllBox(){
        expandAllButton.click();
        checkBoxHome.click();
    }

    public List<String> getResultsList(){
        List<String> results = new ArrayList<>();
        for (SelenideElement resultTitle : resultTitles){
            results.add(resultTitle.getText().toLowerCase());
        }
        return results;
    }

    public List<String> getAllCheckBoxTutlesList(){
        List<String> checkBoxTitles = new ArrayList<>();
        for (SelenideElement checkBoxTitle : allCheckBoxTitles){
            int index = checkBoxTitle.getText().indexOf(".");
            if(index!=-1){
                checkBoxTitles.add(checkBoxTitle.getText()
                        .toLowerCase()
                        .replaceAll("\\s", "")
                        .substring(0, index-1));
            }else {
                checkBoxTitles.add(checkBoxTitle.getText()
                        .toLowerCase()
                        .replaceAll("\\s", ""));
            }

        }
        return checkBoxTitles;
    }
}
