package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;

public class LoginStepdefs {
    @Steps
    Login login;

    @Given("I am on the Login page")
    public void iAmOnTheLoginPage() {
        login.open();
        login.buttonLogin();
    }

    @When("I input {string} and {string}")
    public void iInputAnd(String email, String password) {
        login.inputEmail(email);
        login.inputPassword(password);
    }

    @And("click login button")
    public void clickLoginButton() {
        login.clickTombolLogin();
    }

    @Then("I validate {string}")
    public void iValidate(String response) {
        if(response.equals("berhasil")) {
            login.HeaderHome();
        } else if(response.equals("email null")){
            login.validateErrorBlank();
        }else if(response.equals("password null")) {
            login.validateErrorBlank();
        }else if(response.equals("null")) {
            login.validateErrorBlank();
        }else if(response.equals("length invalid")) {
            login.validatePassword();
        }
    }
}
