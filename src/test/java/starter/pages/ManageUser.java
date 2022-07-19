package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ManageUser extends PageObject {

    private By MenuManageUser() {
        return By.xpath("//*[text()='User Menu']");
    }

    private By subMenuManageUser() {
        return By.xpath("//*[@Class='sub-menu']//*[text()='Manage User']");
    }

    private By editButton() {
        return By.xpath("//*[@id=\"my-table\"]/tbody/tr[4]/td[5]/button");
    }

    private By editButton1() {
        return By.xpath("//*[@id=\"my-table\"]/tbody/tr[8]/td[5]/button");
    }

    private By fieldName() {
        return By.xpath("//*[@Class='col-sm-10']//input[@type='name']");
    }

    private By fieldEmail() {
        return By.xpath("//*[@Class='col-sm-10']//input[@type='email']");
    }

    private By fieldGender() {
        return By.xpath("//*[@Class='col-sm-10']//input[@type='gender']");
    }

    private By fieldRole() {
        return By.xpath("//select[@id='input-6']");
    }

    private By selectRole() {
        return By.xpath("//*[select]//*[text()='Doctor']");
    }

    private By fieldFacility() {
        return By.xpath("//*[@id='input-6']");
    }

    private By selectFacility() {
        return By.xpath("//*[select]//*[text()='Umum']");
    }

    private By updateButton() {
        return By.xpath("//*[@type='submit']");
    }

    private By errorBlank() {
        return By.xpath("//*[@Class='d-flex my-1 toggle text-danger']");
    }

    private By errorDuplicateFullName() {
        return By.xpath("//*[contains(text(),'duplicate full name')]");
    }

    private By errorDuplicateEmail() {
        return By.xpath("//*[contains(text(),'duplicate email')]");
    }
    private By errorLengthName() {
        return By.xpath("//*[text()='the length must be no less than 5 ']");
    }

    @Step
    public void validateErrorBlank() {
        $(errorBlank()).isDisplayed();
    }

    @Step
    public void validateErrorLengthName() {
        $(errorLengthName()).isDisplayed();
    }

    @Step
    public void validateErrorDuplicateFullName() {
        $(errorDuplicateFullName()).isDisplayed();
    }

    @Step
    public void validateDuplicateEmail() {
        $(errorDuplicateEmail()).isDisplayed();
    }

    @Step
    public void clickSubMenuManageUser() {
        $(subMenuManageUser()).click();
    }

    @Step
    public void clickMenuManageUser() {
        $(MenuManageUser()).click();
    }

    @Step
    public void clickEditButton() {
        $(editButton()).click();
    }

    @Step
    public void clickEditButton1() {
        $(editButton1()).click();
    }

    @Step
    public void inputFieldName(String name) {
        $(fieldName()).type(name);
    }


    @Step
    public void inputFieldEmail(String email) {
        $(fieldEmail()).type(email);
    }

    @Step
    public void inputFieldGender(String gender) {
        $(fieldGender()).type(gender);
    }

    @Step
    public void inputFieldGenderr() {
        $(fieldGender()).type("Male");
    }

    @Step
    public void selectFieldRole() {
        $(fieldRole()).click();
        $(selectRole()).click();
    }

    @Step
    public void selectFieldFacility() {
        $(fieldFacility()).click();
        $(selectFacility()).click();
    }

    @Step
    public void clickUpdateButton() {
        $(updateButton()).click();
    }

    private By search() {
        return By.xpath("//input[@type='search']");
    }

    private By user() {
        return By.xpath("//*[text()='Nama User']");
    }

    @Step
    public void inputSearch() {
        $(search()).click();
        $(search()).type("rimu");
    }

    @Step
    public void validateUser() {
        $(user()).isDisplayed();
    }
}
