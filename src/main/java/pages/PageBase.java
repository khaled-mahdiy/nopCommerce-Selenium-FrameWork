package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    WebDriver driver;
    public PageBase(WebDriver driver)
    {
        this.driver = driver;
    }
    public void writeTextInInput(By element , String text) {
        driver.findElement( element).sendKeys(text);
    }
    public void clickOnButton(By element) {
        driver.findElement(element).click();
    }
    public String getElementText(By element)
    {
        return driver.findElement(element).getText();
    }

    public void waitForVisibilityOfElement(By element)
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }
    public void waitForElementToBeClickable(By element)
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitForUrlToBe(String url)
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlToBe(url));
    }
}
