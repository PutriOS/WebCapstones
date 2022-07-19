package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Outpatient extends PageObject {
    private By menuOutpatient() {
        return By.xpath("//*[@class='d-flex justify-content-between align-items-center border-bottom list-group-item ungusecondary text-white p-3']//*[text()='Outpatient']");
    }
    private By menuOutpatient1() {
        return By.xpath("/html/body/div/div/div[1]/div/a[2]");
    }

    private By subMenuOutpatientList() {
        return By.xpath("//*[@class='sub-menu']//*[text()='Outpatient List']");
    }

    private By headerOutpatientList() {
        return By.xpath("//*[text()='OUTPATIENT LIST']");
    }

//    private By outpatientList() {
//        return By.xpath("//*[text()='RM00016']");
//    }

    @Step
    public void clickMenuOutpatient() {
        $(menuOutpatient()).click();
    }

    @Step
    public void clickMenuOutpatient1() {
        $(menuOutpatient1()).click();
    }

    @Step
    public void clickSubmenuOutpatientList() {
        $(subMenuOutpatientList()).click();
    }

    @Step
    public void validateOutpatientList() {
        $(headerOutpatientList()).isDisplayed();
    }

    private By subMenuAddOutPatient() {
        return By.xpath("//*[text()='Add Outpatient']");
    }

    private By headerAddOutPatient() {
        return By.xpath("//*[text()='OUTPATIENT DATA FORM']");
    }

    private By subMenuOutPatientReport() {
        return By.xpath("//*[text()='Outpatient Report']");
    }

    private By headerOutPatientReport() {
        return By.xpath("//*[text()='OUTPATIENT REPORT']");
    }


    @Step
    public void clickSubMenuAddOutPatient() {
        $(subMenuAddOutPatient()).click();
    }

    @Step
    public void clickSubMenuOutPatientReport() {
        $(subMenuOutPatientReport()).click();
    }

    @Step
    public void validateHeaderAddOutPatient() {
        $(headerAddOutPatient()).click();
    }

    @Step
    public void validateHeaderOutPatientReport() {
        $(headerOutPatientReport()).click();
    }

    private By nextButton() {
        return By.xpath("//*[@Class='page-item']//*[text()='2']");
    }

    private By validateNextPagination() {
        return By.xpath("//*[@aria-rowindex=\"11\"]");
    }

    private By previousButton() {
        return By.xpath("//*[@Class='page-item active']//*[text()='1']");
    }

    private By validatePreviousPagination() {
        return By.xpath("//*[@aria-rowindex=\"1\"]");
    }

    @Step
    public void clickNextPagination() {
        $(nextButton()).click();
    }

    @Step
    public void validationNextPagination() {
        $(validateNextPagination()).click();
    }

    @Step
    public void clickPreviousPagination() {
        $(previousButton()).click();
    }

    @Step
    public void validationPreviousPagination() {
        $(validatePreviousPagination()).click();
    }

    private By viewReportButton() {
        return By.xpath("//*[text()=' View Report ']");
    }

    private By keluhan() {
        return By.xpath("//*[text()='Sakit Telinga']");
    }

    @Step
    public void clickViewReportButton() {
        $(viewReportButton()).click();
    }

    @Step
    public void validateKeluhan() {
        $(keluhan()).isDisplayed();
    }

    private By fieldkodePasien() {
        return By.xpath("//input[@id='input-1']");
    }

    private By fieldnamaPasien() {
        return By.xpath("//input[@id='input-2']");
    }

    private By fieldTanggalKontrol() {
        return By.xpath("//*[text()='No date selected']");
    }

    private By selectTanggalKontrol() {
        return By.xpath("//span[text()='14']");
    }

    private By fieldPoli() {
        return By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[5]//select[@id='input-6']");
    }

    private By selectPoli() {
        return By.xpath("//*[text()='Umum']");
    }

    private By fieldSesi() {
        return By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[6]//select[@id='input-6']");
    }

    private By selectSesi() {
        return By.xpath("//*[text()='Pagi (08.00 - 11.00)']");
    }

    private By fieldDokter() {
        return By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[7]//select[@id='input-7']");
    }

    private By selectDokter() {
        return By.xpath("//*[@value='DCR00001']");
    }

    private By fieldKeluhan() {
        return By.xpath("//input[@id='input-3']");
    }

    private By fieldNomorAntrian() {
        return By.xpath("//input[@id='input-4']");
    }

    private By submitButton() {
        return By.xpath("//*[text()='Submit']");
    }

    private By fieldBlank() {
        return By.xpath(" //*[text()='cannot be blank ']");
    }

    @Step
    public void validateFieldBlank() {
        $(fieldBlank()).isDisplayed();
    }

    @Step
    public void inputFieldNamaPasien(String namaPasien) {
        $(fieldnamaPasien()).type(namaPasien);
    }

    @Step
    public void inputFieldKodePasien(String kodePasien) {
        $(fieldkodePasien()).type(kodePasien);
    }

    @Step
    public void inputFieldTanggalKontrol() {
        $(fieldTanggalKontrol()).click();
        $(selectTanggalKontrol()).click();
    }

    @Step
    public void inputFieldPoli() {
        $(fieldPoli()).click();
        $(selectPoli()).click();
    }

    @Step
    public void inputFieldSesi() {
        $(fieldSesi()).click();
        $(selectSesi()).click();
    }

    @Step
    public void inputFieldDokter() {
//        $(fieldDokter()).click();
        $(selectDokter()).click();
    }

    @Step
    public void inputFieldKeluhan(String keluhann) {
        $(fieldKeluhan()).type(keluhann);
    }

    @Step
    public void inputFieldnomorAntrian(String antrian) {
        $(fieldNomorAntrian()).type(antrian);
    }

    @Step
    public void clickSubmitButton() {
        $(submitButton()).click();
    }
}
