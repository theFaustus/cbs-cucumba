package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class WhenSteps {

    @When("^I complete all the fields of the login form$")
    public void iCompleteAllTheFieldsOfTheLoginForm() {
        WebElement username = Util.getDriver().findElement(By.xpath("//input[@id='mat-input-0']"));
        username.sendKeys("hector");

        WebElement password = Util.getDriver().findElement(By.xpath("//input[@id='mat-input-1']"));
        password.sendKeys("admin");
    }

    @And("^I click the login button$")
    public void iClickTheLoginButton() {
        WebElement login =
                Util.getDriver().findElement(By.xpath("//button[@class='mat-raised-button mat-primary _mat-animation-noopable']"));
        login.click();
    }

    @When("^I complete all the fields with admin credentials of the login form$")
    public void iCompleteAllTheFieldsWithAdminCredentialsOfTheLoginForm() {
        WebElement username = Util.getDriver().findElement(By.xpath("//input[@id='mat-input-0']"));
        username.sendKeys("admin");

        WebElement password = Util.getDriver().findElement(By.xpath("//input[@id='mat-input-1']"));
        password.sendKeys("admin");
    }

    @When("^I click on the board$")
    public void iClickOnTheBoard() {
        WebElement board =
                Util.getDriver().findElement(By.xpath("//span[contains(text(),'Board')]"));
        board.click();
    }
}
