package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Elements for Login
    By emailInput = By.id("Email");
    By passwordInput = By.id("Password");
    By loginButton = By.xpath("//button[@class=\"button-1 login-button\"]");

    //Actions & Methods for login
    private void enterEmail(String email)
    {
        waitForVisibilityOfElement(emailInput);
        waitForElementToBeClickable(emailInput);
        writeTextInInput(emailInput,email);
    }
    private void enterPassword(String password)
    {
        waitForVisibilityOfElement(passwordInput);
        waitForElementToBeClickable(passwordInput);
        writeTextInInput(passwordInput,password);
    }
    private void clickOnLoginButton()
    {
        waitForVisibilityOfElement(loginButton);
        waitForElementToBeClickable(loginButton);
        clickOnButton(loginButton);
    }
    public void loginWithValidUser(String email , String password )
    {
        enterEmail(email);
        enterPassword(password);
        clickOnLoginButton();
    }
}
