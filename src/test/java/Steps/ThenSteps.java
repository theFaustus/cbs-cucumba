package Steps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertEquals;


public class ThenSteps {

    @Then("^I am logged in as an user$")
    public void theLoginFormIsSuccessfullySubmitted() {
        WebElement loggedInMessage = Util.getDriver().findElement(By.xpath("//span[contains(text(),'Logged in as ROLE_USER.')]"));

        String messageText = loggedInMessage.getText();
        String currentURL = Util.getDriver().getCurrentUrl();

        assertEquals("http://localhost:4200/auth/login", currentURL);
        assertEquals("Logged in as ROLE_USER.", messageText);
    }

    @Then("^I am logged in as an admin$")
    public void iAmLoggedInAsAnAdmin() {
        WebElement loggedInMessage = Util.getDriver().findElement(By.xpath("//span[contains(text(),'Logged in as ROLE_ADMIN.')]"));

        String messageText = loggedInMessage.getText();
        String currentURL = Util.getDriver().getCurrentUrl();

        assertEquals("http://localhost:4200/auth/login", currentURL);
        assertEquals("Logged in as ROLE_ADMIN.", messageText);
    }

    @Then("^I see movies tab$")
    public void iSeeMoviesTab() {
        WebElement moviesMessage = Util.getDriver().findElement(By.xpath("//div[contains(text(),'MOVIES')]"));
        String moviesTabText = moviesMessage.getText();

        assertEquals("MOVIES", moviesTabText);


    }

    @Then("^I see successful registration message$")
    public void iSeeSuccessfulRegistrationMessage() {
        WebElement registeredMessage = Util.getDriver().findElement(By.xpath("//span[contains(text(),'Your registration is successful. Please login!')]"));
        String registeredText = registeredMessage.getText();

        assertEquals("Your registration is successful. Please login!", registeredText);
    }
}
