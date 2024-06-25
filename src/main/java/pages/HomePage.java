package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Elements
    public String pageTitle = "nopCommerce demo store. Register";
    By registerLink = By.linkText("Register");

    //Actions & Methods
    public void openRegisterPage()
    {
        waitForVisibilityOfElement(registerLink);
        waitForElementToBeClickable(registerLink);
        clickOnButton(registerLink);
    }

}
