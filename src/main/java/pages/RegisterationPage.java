package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationPage extends PageBase{

    public RegisterationPage(WebDriver driver) {
        super(driver);
    }

    // Elements for Registration with valid credentials
    //Elements for Personal Details
    private By getGenderInput(String gender)
    {
        By genderRadioButton = By.id("gender-"+gender);
        return genderRadioButton;

    }
    By firstNameInput = By.id("FirstName");
    By lastNameInput = By.id("LastName");
    By emailInput = By.id("Email");

    //Actions & Methods for Personal Details
    private  void selectGender(String gender)
    {
        waitForUrlToBe("https://demo.nopcommerce.com/register?returnUrl=%2F");
        waitForVisibilityOfElement(getGenderInput(gender));
        waitForElementToBeClickable(getGenderInput(gender));
        clickOnButton(getGenderInput(gender));
    }
    private  void enterFirstName(String firstName)
    {
        waitForVisibilityOfElement(firstNameInput);
        waitForElementToBeClickable(firstNameInput);
        writeTextInInput(firstNameInput,firstName);
    }
    private  void enterLastName(String lastName)
    {
        waitForVisibilityOfElement(lastNameInput);
        waitForElementToBeClickable(lastNameInput);
        writeTextInInput(lastNameInput,lastName);
    }
    private  void enterEmail(String email)
    {
        waitForVisibilityOfElement(emailInput);
        waitForElementToBeClickable(emailInput);
        writeTextInInput(emailInput,email);
    }

    //Elements for Company Details
    By companyNameInput = By.id("Company");

    //Actions & Methods for Company Details
    private  void enterCompanyName(String companyName)
    {
        waitForVisibilityOfElement(emailInput);
        waitForElementToBeClickable(emailInput);
        writeTextInInput(companyNameInput,companyName);
    }

    //Elements for  Password
    By passwordInput = By.id("Password");
    By confirmPasswordInput = By.id("ConfirmPassword");

    //Actions & Methods for Company Details
    private  void enterPassword(String password)
    {
        waitForVisibilityOfElement(passwordInput);
        waitForElementToBeClickable(passwordInput);
        writeTextInInput(passwordInput,password);
    }
    private  void enterConfirmPassword(String confirmPassword)
    {
        waitForVisibilityOfElement(confirmPasswordInput);
        waitForElementToBeClickable(confirmPasswordInput);
        writeTextInInput(confirmPasswordInput,confirmPassword);
    }

    By registerButton = By.id("register-button");
    private void clickOnRegisterButton()
    {
        waitForVisibilityOfElement(registerButton);
        waitForElementToBeClickable(registerButton);
        clickOnButton(registerButton);
    }
    //Elements for  successfully registered message
    public String successRegisteredMessageText = "Your registration completed";
    By successMessageElement = By.className("result");
    //Actions & Methods for  successfully registered message

    public String getSuccessfullyRegisteredMessageText()
    {
        waitForVisibilityOfElement(successMessageElement);
        return getElementText(successMessageElement);
    }
    // Actions & Methods for Registration with valid credentials
    public void userRegistration(String gender, String firstName,String lastName,String email,String companyName,String password,String confirmPassword)
    {
        selectGender(gender);
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmail(email);
        enterCompanyName(companyName);
        enterPassword(password);
        enterConfirmPassword(confirmPassword);
        clickOnRegisterButton();
    }

}
