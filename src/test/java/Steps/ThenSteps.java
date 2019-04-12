package Steps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertEquals;


public class ThenSteps {

    @Then("^the login form is successfully submitted$")
    public void theLoginFormIsSuccessfullySubmitted() {
        WebElement loggedInMessage = Util.getDriver().findElement(By.xpath("//span[contains(text(),'Logged in as ROLE_USER.')]"));

        String messageText = loggedInMessage.getText();
        String currentURL = Util.getDriver().getCurrentUrl();

        assertEquals("http://localhost:4200/auth/login", currentURL);
        assertEquals("Logged in as ROLE_USER.", messageText);
    }
}
