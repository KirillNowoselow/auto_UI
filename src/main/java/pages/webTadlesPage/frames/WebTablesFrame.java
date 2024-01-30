package pages.webTadlesPage.frames;

import com.codeborne.selenide.SelenideElement;
import elements.basic.Button;
import elements.basic.Input;

import static com.codeborne.selenide.Selenide.$x;

public class WebTablesFrame {
    public Button addRecordBtn = new Button("Add");

    public Input firstName = new Input("firstName","First Name");
    public Input lastName = new Input("lastName","Last Name");
    public Input email = new Input("userEmail","Email");
    public Input age = new Input("age","Age");
    public Input salary = new Input("salary","Salary");
    public Input department = new Input("department","Department");
    public Button submitBtn = new Button("Submit");
    public void clickAddRecordBtn(){addRecordBtn.clickBtn();}
    public void inputFirstName(String value){firstName.setValue(value);}
    public void inputLastName(String value){lastName.setValue(value);}
    public void inputEmail(String value){email.setValue(value);}
    public void inputAge(Integer value){age.setValue(String.valueOf(value));}
    public void inputSalary(Integer value){salary.setValue(String.valueOf(value));}
    public void inputDepartment(String value){department.setValue(value);}
    public void clickSubmitBtn(){submitBtn.clickBtn();}
}
