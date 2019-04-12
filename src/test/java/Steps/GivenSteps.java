package Steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;


public class GivenSteps {
    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        Util.getDriver().get("http://localhost:4200/home");

        WebElement login = Util.getDriver().
                findElement(By.xpath("//a[@id='login']"));
        login.click();

    }
}
