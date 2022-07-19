package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Home;
import starter.pages.Login;

public class HomeStepdefs {
    @Steps
    Home home;

    @Steps
    Login login;

    @When("I click menu outpatient report")
    public void iClickMenuOutpatientReport() {
        home.clickMenuManageOutpatientReport();
    }

    @Then("I am on outpatient report page")
    public void iAmOnOutpatientReportPage() {
        home.validateHeaderOutpatientReportPage();
    }

    //Change Password
    @And("I click menu change password")
    public void iClickMenuChangePassword() throws InterruptedException {
        Thread.sleep(500);
        home.clickMenuChangePassword();
    }

    @When("I input new change {string}")
    public void iInputNewChange(String pass) {
        home.inputChangePassword(pass);
        home.clickSubmitButton();
    }

    @Then("I validate {string} change password")
    public void iValidateChangePassword(String respons) throws InterruptedException {
        if(respons.equals("blank")){
            home.validateErrorPasswordBlank();
        }else if(respons.equals("invalid length")){
            home.validateErrorPasswordLength();
        }
    }
}
