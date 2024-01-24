import config.Driver;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.MainPage;

public class ElementsTests {
    Driver driver = new Driver();

    @Test
    public void test(){
        MainPage mainPage = new MainPage();
        ElementsPage elementsPage = mainPage.goToElements();
        driver.close();
    }
}
