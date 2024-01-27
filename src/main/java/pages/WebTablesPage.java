package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WebTablesPage {
    private final SelenideElement addRecordBtn = $x("//button[@id='addNewRecordButton']");
    private final SelenideElement firstName = $x("//input[@id='firstName']");
    private final SelenideElement lastName = $x("//input[@id='lastName']");
    private final SelenideElement email = $x("//input[@id='userEmail']");
    private final SelenideElement age = $x("//input[@id='age']");
    private final SelenideElement salary = $x("//input[@id='salary']");
    private final SelenideElement department = $x("//input[@id='department']");
    private final SelenideElement submitBtn = $x("//button[@id='submit']");

    public void clickAddRecordBtn(){addRecordBtn.click();}
    public void inputFirstName(String value){firstName.setValue(value);}
    public void inputLastName(String value){lastName.setValue(value);}
    public void inputEmail(String value){email.setValue(value);}
    public void inputAge(Integer value){age.setValue(String.valueOf(value));}
    public void inputSalary(Integer value){salary.setValue(String.valueOf(value));}
    public void inputDepartment(String value){department.setValue(value);}
    public void clickSubmitBtn(){submitBtn.click();}
}