package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ForgotPassword extends PageObject {

    private By forgotPassword() {
        return By.xpath("//*[text()='FORGOT PASSWORD']");
    }

    private By email() {
        return By.xpath("//input[@type='email']");
    }

    private By continueButton() {
        return By.xpath("//button[@type='submit']");
    }

    private By errorEmail() {
        return By.xpath("//*[text()='Failed to Find Email ']");
    }

    private By newPassword() {
        return By.xpath("/html/body/div/div/div/div/div[1]/div/div/div/div/input[1]");
    }

    private By confirmNewPassword() {
        return By.xpath("/html/body/div/div/div/div/div[1]/div/div/div/div/input[2]");
    }

    private By confirmButton() {
        return By.xpath("//button[text()='CONFIRM']");
    }

    private By errorIncorrectPass() {
        return By.xpath("//*[text()='Incorrect Password ']");
    }

    private By errorPasswordBlank() {
        return By.xpath("//*[text()='Cannot be Blank ']");
    }

    private By passwordChange() {
        return By.xpath("//*[text()=' Password Changed ']");
    }

    @Step
    public void clickForgotPassword() {
        $(forgotPassword()).click();
    }

    @Step
    public void validatePasswordChange() {
        $(passwordChange()).click();
    }

    @Step
    public void inputEmail() {
        $(email()).type("alsyadahmad@holyhos.co.id");
    }

    @Step
    public void clickContinueButton() {
        $(continueButton()).click();
    }

    @Step
    public void inputNewPassword(String password) {
        $(newPassword()).type(password);
    }

    @Step
    public void inputConfirmNewPassword(String confirm) {
        $(confirmNewPassword()).type(confirm);
    }

    @Step
    public void clickConfirmButton() {
        $(confirmButton()).click();
    }

    @Step
    public void validateErrorPasswordBlank() {
        $(errorPasswordBlank()).isDisplayed();
    }

    @Step
    public void validateErrorIncorrectPass() {
        $(errorIncorrectPass()).isDisplayed();
    }
}
