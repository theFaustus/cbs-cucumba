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

    @When("^I complete all the fields of the register form$")
    public void iCompleteAllTheFieldsOfTheRegisterForm() {
        WebElement username = Util.getDriver().findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("drake");

        WebElement email = Util.getDriver().findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("drake@gmail.com");

        WebElement firstName = Util.getDriver().findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("drake");

        WebElement lastName = Util.getDriver().findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("doe");

        WebElement telephoneNumber = Util.getDriver().findElement(By.xpath("//input[@id='telephoneNumber']"));
        telephoneNumber.sendKeys("0(69)-373-373");

        WebElement password = Util.getDriver().findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("123abcABC*");
    }

    @And("^I click the sign up button$")
    public void iClickTheSignUpButton() {
        WebElement signUp =
                Util.getDriver().findElement(By.xpath("//span[contains(text(),'Register')]"));
        signUp.click();
    }

    @When("^I click on the dashboard$")
    public void iClickOnTheDashboard() {
        WebElement dashboard =
                Util.getDriver().findElement(By.xpath("//span[contains(text(),'Dashboard')]"));
        dashboard.click();
    }

    @And("^I click on the users tab$")
    public void iClickOnTheUsersTab() {
        WebElement userTab =
                Util.getDriver().findElement(By.xpath("//div[contains(text(),'USERS')]"));
        userTab.click();
    }

    @And("^I click on the add$")
    public void iClickOnTheAdd() {
        WebElement addButton = Util.getDriver().
                findElement(By.xpath("//span[contains(text(),'Add')]"));
        addButton.click();
    }

    @And("^I complete all the fields of the add form$")
    public void iCompleteAllTheFieldsOfTheAddForm() {
        WebElement username = Util.getDriver().findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("coolio");

        WebElement email = Util.getDriver().findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("coolio@gmail.com");

        WebElement firstName = Util.getDriver().findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("coolio");

        WebElement lastName = Util.getDriver().findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("gangster");

        WebElement telephoneNumber = Util.getDriver().findElement(By.xpath("//input[@id='telephoneNumber']"));
        telephoneNumber.sendKeys("0(69)-373-373");

        WebElement password = Util.getDriver().findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("123abcABC*");
    }

    @And("^I click register button$")
    public void iClickRegisterButton() {
        WebElement registerButton = Util.getDriver().
                findElement(By.xpath("//span[contains(text(),'Register')]"));
        registerButton.click();
    }

    @And("^I click on the delete$")
    public void iClickOnTheDelete() {
        WebElement deleteButton = Util.getDriver().
                findElement(By.xpath("//button[@id='delete-1280']"));
        deleteButton.click();
    }
}
