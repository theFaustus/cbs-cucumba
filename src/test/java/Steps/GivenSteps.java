package Steps;

import cucumber.api.java.en.And;
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

    @Given("^I am logged in$")
    public void iAmLoggedIn() {
        Util.getDriver().get("http://localhost:4200/home");

        WebElement login = Util.getDriver().
                findElement(By.xpath("//a[@id='login']"));
        login.click();

        WebElement username = Util.getDriver().findElement(By.xpath("//input[@id='mat-input-0']"));
        username.sendKeys("hector");

        WebElement password = Util.getDriver().findElement(By.xpath("//input[@id='mat-input-1']"));
        password.sendKeys("admin");

        WebElement loginButton =
                Util.getDriver().findElement(By.xpath("//button[@class='mat-raised-button mat-primary _mat-animation-noopable']"));
        loginButton.click();
    }

    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
        Util.getDriver().get("http://localhost:4200/auth/login");
    }

    @Given("^I am on the register page$")
    public void iAmOnTheRegisterPage() {
        Util.getDriver().get("http://localhost:4200/home");

        WebElement signUp = Util.getDriver().
                findElement(By.xpath("//span[contains(text(),'Sign up')]"));
        signUp.click();
    }

    @Given("^I am logged in as an admin user$")
    public void iAmLoggedInAsAnAdminUser() {
        Util.getDriver().get("http://localhost:4200/home");

        WebElement login = Util.getDriver().
                findElement(By.xpath("//a[@id='login']"));
        login.click();

        WebElement username = Util.getDriver().findElement(By.xpath("//input[@id='mat-input-0']"));
        username.sendKeys("admin");

        WebElement password = Util.getDriver().findElement(By.xpath("//input[@id='mat-input-1']"));
        password.sendKeys("admin");

        WebElement loginButton =
                Util.getDriver().findElement(By.xpath("//button[@class='mat-raised-button mat-primary _mat-animation-noopable']"));
        loginButton.click();
    }
}
