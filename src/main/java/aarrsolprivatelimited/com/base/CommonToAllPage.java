package aarrsolprivatelimited.com.base;

import aarrsolprivatelimited.com.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.time.Duration;

import static aarrsolprivatelimited.com.driver.DriverManager.getDriver;
import static java.sql.DriverManager.getDriver;

public class CommonToAllPage {
    //if you want to call something before every page object class call put yor

    // Open file, Open Data Base Connection you can write code here
    public CommonToAllPage() {
    }
    public void openVICLoginURL(String url) {
        try {
            switch (url){
                case "qa":
                    getDriver().get(PropertyReader.readkey("qa_url"));
                    break;
                case "preprod":
                    getDriver().get(PropertyReader.readkey("uat_url"));
                    break;
                default:
                    getDriver().get(PropertyReader.readkey("url"));
                    break;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }

    public void clickElement(WebElement by) {
        by.click();

    }

    public void sendKeys(By by, String key){
        getDriver().findElement(by).sendKeys(key);
    }
    public void enterInput(WebElement element, String key){
        element.sendKeys(key);
    }

    // Waits
    public WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }
    public WebElement visibilityOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    public WebElement getElement(By key) {
        return getDriver().findElement(key);
    }

    public WebElement getElement(WebElement element) {
        return element;
    }

}
