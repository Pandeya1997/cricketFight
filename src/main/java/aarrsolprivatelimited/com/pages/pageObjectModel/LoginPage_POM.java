package aarrsolprivatelimited.com.pages.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_POM {

    // Contains
    // Page Locaters
    WebDriver driver;

    public LoginPage_POM(WebDriver driver) {
        this.driver = driver;
    }

     //
    private By loginPop = By.xpath("//button [@data-target='#loginModal']");
    private By username = By.xpath("//input[@placeholder = 'Username']");
    private By password = By.xpath("//input[@placeholder = 'Password']");
    private By signButton = By.xpath("//button[@title=\"Login\"]");
    private By error_message = By.xpath("//span [@class=\"text-danger\"]");

    // Page Action
    // LoginT

    public String loginToVICInvalidCreds(String user , String pwd ){
        driver.get("https://victoryexch9.com/");
        driver.findElement(loginPop).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_msg = driver.findElement(By.className("text-danger")); // class="text-danger"
        String error_msg_text = error_msg.getText();
        String error_msg_attribute_dataqa =  error_msg.getAttribute("data-qa");
        System.out.println(error_msg_attribute_dataqa);

        return  error_msg_text;

    }
   public void loginToVICPostiveCreds(String user, String pwd){
         driver.get("https://victoryexch9.com/");
         driver.findElement(loginPop).click();

       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

       driver.findElement(username).sendKeys(user);
       driver.findElement(password).sendKeys(pwd);
       driver.findElement(signButton).click();

       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

   }
}
