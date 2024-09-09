package aarrsolprivatelimited.com.test;

import aarrsolprivatelimited.com.pages.pageObjectModel.LoginPage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVICLogin_POM {
    @Test
    public void testLoginNegativeVIC()  {
        WebDriver driver = new EdgeDriver();

        LoginPage_POM loginPage_pom = new LoginPage_POM(driver);
        String error_msg_text = loginPage_pom.loginToVICInvalidCreds("admin@admin.com","admin" );
        Assert.assertEquals(error_msg_text, "Username / Password INVALID !!!");
        driver.quit();

    }

@Test
public void testLoginPositiveVIC()  {
    WebDriver driver = new EdgeDriver();

    LoginPage_POM loginPage_pom = new LoginPage_POM(driver);
    loginPage_pom.loginToVICPostiveCreds("dcuser01", "abcd12345");

    driver.quit();

}

}