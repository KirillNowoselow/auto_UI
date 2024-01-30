package utils;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionConverter {
    public static List<String> collectionToList(ElementsCollection elementsCollection){
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
    public static Map<String, String> collectionToMap(ElementsCollection elementsCollection){
        Map<String, String> data = new HashMap<>();
        for (SelenideElement outputElement : elementsCollection) {
            String element = outputElement.getText();
            int index = element.indexOf(":");
            data.put(element.substring(0, index).replaceAll("\\s", ""),element.substring(index + 1));
        }
        return data;
    }
}
