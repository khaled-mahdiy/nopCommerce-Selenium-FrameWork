package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBase {
    public static WebDriver driver;
    public String pageTitle = "nopCommerce demo store";
    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Assert.assertEquals(getPageTitle(),pageTitle);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    }
    @Test
    public String getPageTitle()
    {
        return driver.getTitle();
    }
//    @AfterClass
//    public void closeBrowser()
//    {
//        driver.quit();
//    }
}
