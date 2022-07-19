package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private By Email() {
        return By.xpath("/html/body/div/div/div/div/div[1]/div/div/div/form/div[1]/input");
    }

    private By buttonLoginScreen() {
        return By.xpath("/html/body/div/div/div/div/div[1]/div/div[2]/div/div/div/div[1]/a");
    }

    private By passwordChange() {
        return By.xpath("//*[text()=' Password Changed ']");
    }

    private By Password() {
        return By.xpath("//*[@class='input-group flex-nowrap mb-3'][2]/input");
    }

    private By buttonAdminLogin() {
        return By.xpath("//*[@class='d-grid gap-2']//*[@class='btn btn-primary']");
    }

    private By Header() {
        return By.xpath("//*[text()='HOSPITAL MANAGEMENT SYSTEM']");
    }

    private By errorBlank() {
        return By.xpath("//*[text()='cannot be blank ']");
    }

    private By errorPassword() {
        return By.xpath("//*[text()='the length must be no less than 8 ']");
    }

    @Step
    public void validateErrorBlank() {
        $(errorBlank()).isDisplayed();
    }

    @Step
    public void validatePassword() {
        $(errorPassword()).isDisplayed();
    }

    @Step
    public void buttonLogin() {
        $(buttonLoginScreen()).click();
    }

    @Step
    public void validatePasswordChange() {
        $(passwordChange()).isDisplayed();
    }

    @Step
    public void inputEmail(String email) {
        $(Email()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(Password()).type(password);
    }

    @Step
    public void clickTombolLogin() {
        $(buttonAdminLogin()).click();
    }

    @Step
    public void HeaderHome() {
        $(Header()).isDisplayed();
    }

}
