package starter.stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ManageUser;

public class ManageUserStepdefs {
    @Steps
    ManageUser manageUser;

    @Steps
    OutpatientStepdefs outpatientStepdefs;
    
    @Given("I am on Manage user page")
    public void iAmOnManageUserPage() throws InterruptedException {
        outpatientStepdefs.iAmOnHomePage();
        manageUser.clickMenuManageUser();
        manageUser.clickSubMenuManageUser();
        Thread.sleep(500);
    }

    @When("I input {string}, {string}, {string}, {string}, {string}")
    public void iInput(String namaUser, String email, String jenisKelamin, String role, String fasilitas) {
        manageUser.clickEditButton();
        manageUser.inputFieldName(namaUser);
        manageUser.inputFieldEmail(email);
        manageUser.inputFieldGender(jenisKelamin);
        manageUser.selectFieldRole();
        manageUser.selectFieldFacility();
    }

    @And("I click update button")
    public void iClickUpdateButton() throws InterruptedException {
        Thread.sleep(500);
        manageUser.clickUpdateButton();
    }

    @Then("I am validating the {string}")
    public void iAmValidatingThe(String responses) throws InterruptedException {
        Thread.sleep(500);
        if(responses.equals("name null")){
            manageUser.validateErrorBlank();
        }else if(responses.equals("email null")){
            manageUser.validateErrorBlank();
        }else if(responses.equals("gender null")){
            manageUser.validateErrorBlank();
        }else if(responses.equals("role null")){
            manageUser.validateErrorBlank();
        }else if(responses.equals("fasilitas null")){
            manageUser.validateErrorBlank();
        }else if(responses.equals("duplicate name")){
            manageUser.validateErrorDuplicateFullName();
        }else if(responses.equals("duplicate email")){
            manageUser.validateDuplicateEmail();
        }else if(responses.equals("length invalid")){
            manageUser.validateErrorLengthName();
        }
    }

    @When("I input search")
    public void iInputSearch() {
        manageUser.inputSearch();
    }

    @When("I update user data")
    public void iUpdateUserData() {
        manageUser.clickEditButton1();
        Faker faker = new Faker();
        String email = faker.internet().domainName() + "@holyhos.co.id";
        manageUser.inputFieldName(faker.internet().domainName());
        manageUser.inputFieldEmail(email);
        manageUser.inputFieldGenderr();
        manageUser.selectFieldRole();
        manageUser.selectFieldFacility();
        manageUser.clickUpdateButton();
    }

    @Then("I am validate user")
    public void iAmValidateUser() throws InterruptedException {
        manageUser.validateUser();
    }

    @Then("I am validating the element")
    public void iAmValidatingTheElement() throws InterruptedException {
        manageUser.validateUser();
    }
}
