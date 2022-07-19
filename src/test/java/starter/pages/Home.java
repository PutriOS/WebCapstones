package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Home extends PageObject {
    private By menuManageOutpatientReport() {
        return By.xpath("//*[text()='Manage Outpatient Report']");
    }

    private By headerOutpatientReportPage() {
        return By.xpath("//*[text()='OUTPATIENT REPORT']");
    }

    @Step
    public void clickMenuManageOutpatientReport() {
        $(menuManageOutpatientReport()).click();
    }

    @Step
    public void validateHeaderOutpatientReportPage() {
        $(headerOutpatientReportPage()).isDisplayed();
    }

    private By menuChangePassword() {
        return By.xpath("//*[@Class='card card text-center mx-2 my-2 text-purple bg-light']//*[text()='Change Password']");
    }

    private By fieldChangePassword() {
        return By.xpath("//*[@Class='inputpass form-control']");
    }

    private By errorPasswordLength(){
        return By.xpath("//*[@Class='d-flex mx-2 my-2 text-danger']");
    }

    private By errorPasswordBlank(){
        return By.xpath("//*[@Class='d-flex mx-2 my-2 text-danger']");
    }

    private By submit(){
        return By.xpath("//*[text()='SUBMIT']");
    }

    @Step
    public void clickMenuChangePassword() {
        openUrl("https://capstone-project-holy-hospital.vercel.app/changepassword");
    }

    @Step
    public void inputChangePassword(String password) {
        $(fieldChangePassword()).type(password);
    }

    @Step
    public void clickSubmitButton() {
        $(submit()).click();
    }

    @Step
    public void validateErrorPasswordBlank() {
        $(errorPasswordBlank()).isDisplayed();
    }

    @Step
    public void validateErrorPasswordLength() {
        $(errorPasswordLength()).isDisplayed();
    }
}
