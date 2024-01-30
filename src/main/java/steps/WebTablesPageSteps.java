package steps;

import io.qameta.allure.Step;
import pages.webTadlesPage.WebTablesPage;

public class WebTablesPageSteps {
    @Step("Клик на Add")
    public void clickAddRecordBtn(WebTablesPage webTablesPage){
        webTablesPage.webTablesFrame.clickAddRecordBtn();
    }

    @Step("Заполнение формы и клик на Submit")
    public void fillRegistrationForm(WebTablesPage webTablesPage, String firstName, String lastName, String email, Integer age, Integer salary, String department){
        webTablesPage.webTablesFrame.inputFirstName(firstName);
        webTablesPage.webTablesFrame.inputLastName(lastName);
        webTablesPage.webTablesFrame.inputEmail(email);
        webTablesPage.webTablesFrame.inputAge(age);
        webTablesPage.webTablesFrame.inputSalary(salary);
        webTablesPage.webTablesFrame.inputDepartment(department);
        webTablesPage.webTablesFrame.clickSubmitBtn();
    }
}
