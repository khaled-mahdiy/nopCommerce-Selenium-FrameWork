package tests;

import data.JsonDataReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterationPage;

import java.io.IOException;

public class RegistrationTest extends TestBase{
    RegisterationPage registerationPage;
    @Test
    public void openRegistrationPage()
    {
        new HomePage(driver).openRegisterPage();
        Assert.assertEquals(getPageTitle(),new HomePage(driver).pageTitle);
    }
    @Test(dependsOnMethods = "openRegistrationPage")
    public void userRegistrationWithValidCred() throws IOException, ParseException {
        registerationPage = new RegisterationPage(driver);
        JSONArray data = new JsonDataReader().jsonReader("registration.json");
        System.out.println(data);
        for (Object object : data)
        {
            JSONObject jsOnObject = (JSONObject) object;
            registerationPage.userRegistration((String)jsOnObject.get("gender"),(String)jsOnObject.get("firstname"),(String)jsOnObject.get("lastname"),(String)jsOnObject.get("email"),(String)jsOnObject.get("companyname"),(String)jsOnObject.get("password"),(String)jsOnObject.get("password"));
        }
        Assert.assertEquals(registerationPage.getSuccessfullyRegisteredMessageText(),registerationPage.successRegisteredMessageText);

    }
}
