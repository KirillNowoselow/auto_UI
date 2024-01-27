package steps;

import pages.WebTablesPage;

public class WebTablesPageSteps {
    public void clickAddRecordBtn(WebTablesPage webTablesPage){
        webTablesPage.clickAddRecordBtn();
    }

    public void fillRegistrationForm(WebTablesPage webTablesPage, String firstName, String lastName, String email, Integer age, Integer salary, String department){
        webTablesPage.inputFirstName(firstName);
        webTablesPage.inputLastName(lastName);
        webTablesPage.inputEmail(email);
        webTablesPage.inputAge(age);
        webTablesPage.inputSalary(salary);
        webTablesPage.inputDepartment(department);
    }
}
