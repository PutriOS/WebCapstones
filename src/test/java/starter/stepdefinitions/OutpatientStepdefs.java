package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;
import starter.pages.Outpatient;

public class OutpatientStepdefs {
    @Steps
    Outpatient outpatient;

    @Steps
    Login login;

    @Given("I am on Home Page")
    public void iAmOnHomePage() {
        login.open();
        login.buttonLogin();
        login.inputEmail("rimurutempest@holyhos.co.id");
        login.inputPassword("password");
        login.clickTombolLogin();
    }

    @When("I click menu outpatient")
    public void iClickMenuOutpatient() {
        outpatient.clickMenuOutpatient1();
    }

    @And("I click sub menu outpatient list")
    public void iClickSubMenuOutpatientList() {
        outpatient.clickSubmenuOutpatientList();
    }

    @Then("I am on outpatient list page")
    public void iAmOnOutpatientListPage() {
        outpatient.validateOutpatientList();
    }

    @And("I click sub menu add outpatient")
    public void iClickSubMenuAddOutpatient() {
        outpatient.clickSubMenuAddOutPatient();
    }

    @Then("I am on add outpatient page")
    public void iAmOnAddOutpatientPage() {
        outpatient.validateHeaderAddOutPatient();
    }

    @And("I click sub menu outpatient report")
    public void iClickSubMenuOutpatientReport() {
        outpatient.clickSubMenuOutPatientReport();
    }

    @Then("I am on outpatient report")
    public void iAmOnOutpatientReport() {
        outpatient.validateHeaderOutPatientReport();
    }


    @Given("I am on Outpatient report Page")
    public void iAmOnOutpatientReportPage() {
        iAmOnHomePage();
        outpatient.clickMenuOutpatient();
        outpatient.clickSubMenuOutPatientReport();
    }

    @When("I click view report button")
    public void iClickViewReportButton() {
        outpatient.clickViewReportButton();
    }

    @Then("I am validate report")
    public void iAmValidateReport() {
        outpatient.validateKeluhan();
    }


    @Given("I am on Add Menu Outpatient")
    public void iAmOnAddMenuOutpatient() {
        iAmOnHomePage();
        outpatient.clickMenuOutpatient();
        outpatient.clickSubMenuAddOutPatient();
    }

    @When("I input {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void iInput(String kodePasien, String namaPasien, String tanggalKontrol, String keluhan, String jenisPoli, String jadwalSesi, String namaDokter, String nomorAntrian) {
        outpatient.inputFieldKodePasien(kodePasien);
        outpatient.inputFieldNamaPasien(namaPasien);
        if (tanggalKontrol.equals("tanggal")){
            outpatient.inputFieldTanggalKontrol();
        }

        outpatient.inputFieldKeluhan(keluhan);

        if (jenisPoli.equals("poli")){
            outpatient.inputFieldPoli();
        }

        if (jadwalSesi.equals("sesi")){
            outpatient.inputFieldSesi();
        }

        if (namaDokter.equals("dokter")){
            outpatient.inputFieldDokter();
        }
        outpatient.inputFieldnomorAntrian(nomorAntrian);
    }

    @And("I click submit button")
    public void iClickSubmitButton() {
        outpatient.clickSubmitButton();
    }

    @Then("I am validate {string}")
    public void iAmValidate(String respond) throws InterruptedException {
        Thread.sleep(5000);
        if(respond.equals("null")){
            outpatient.validateFieldBlank();
        }
    }

    @Given("I am on the outpatient list page")
    public void iAmOnTheOutpatientListPage() {
        iAmOnHomePage();
        outpatient.clickMenuOutpatient();
        outpatient.clickSubmenuOutpatientList();
    }
}