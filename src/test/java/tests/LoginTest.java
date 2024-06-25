package tests;

import data.JsonDataReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.PageBase;

import java.io.IOException;

public class LoginTest extends TestBase {
    @Test
    public void openLoginPage()
    {
        new HomePage(driver).openLoginPage();
        Assert.assertEquals(getPageTitle(),new HomePage(driver).loginPageTitle);

    }
    @Test(dependsOnMethods = "openLoginPage")
    public void loginWithValidCredentials() throws IOException, ParseException {
        JSONArray data = new JsonDataReader().jsonReader("registration.json");
        for (Object object : data)
        {
            JSONObject jsonObject = (JSONObject) object;
            new LoginPage(driver).loginWithValidUser((String) jsonObject.get("email"),(String)jsonObject.get("password"));

        }
        Assert.assertEquals(driver.getCurrentUrl(),new HomePage(driver).homePageTitle);
    }
}
