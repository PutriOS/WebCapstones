package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ForgotPassword;
import starter.pages.Login;

public class ForgotPassStepdefs {
    @Steps
    ForgotPassword forgotPassword;

    @Steps
    Login login;

    @Given("I am on the Forgot password page")
    public void iAmOnTheForgotPasswordPage() {
        login.open();
        login.buttonLogin();
        forgotPassword.clickForgotPassword();
    }

    @And("I input email user")
    public void iInputEmailUser() {
        forgotPassword.inputEmail();
        forgotPassword.clickContinueButton();
    }

    @When("I input new {string} and {string} password")
    public void iInputNewAndPassword(String password, String confirm) {
        forgotPassword.inputNewPassword(password);
        forgotPassword.inputConfirmNewPassword(confirm);
    }

    @And("I click confirm button")
    public void iClickConfirmButton() {
        forgotPassword.clickConfirmButton();
    }

    @Then("I validate change password {string}")
    public void iValidateChangePassword(String respons) {
        if(respons.equals("blank")){
            forgotPassword.validateErrorPasswordBlank();
        }else if(respons.equals("incorrect pass")){
            forgotPassword.validateErrorIncorrectPass();
        }else if(respons.equals("success")){
            forgotPassword.validatePasswordChange();
        }
    }
}
