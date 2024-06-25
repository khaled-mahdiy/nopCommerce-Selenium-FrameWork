package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Elements
    public static String registerPageTitle = "nopCommerce demo store. Register";
    public static String loginPageTitle = "nopCommerce demo store. Login";
    public static String homePageTitle = "https://demo.nopcommerce.com/";

    By registerLink = By.linkText("Register");
    By loginLink    = By.linkText("Log in");
    //Actions & Methods
    public void openRegisterPage()
    {
        waitForVisibilityOfElement(registerLink);
        waitForElementToBeClickable(registerLink);
        clickOnButton(registerLink);
    }
    public void openLoginPage()
    {
        waitForVisibilityOfElement(loginLink);
        waitForElementToBeClickable(loginLink);
        clickOnButton(loginLink);
    }
}
