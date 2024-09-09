package aarrsolprivatelimited.com.test;

import aarrsolprivatelimited.com.base.CommonToAllTest;
import aarrsolprivatelimited.com.pages.pageFactory.LoginPage_PF;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import java.io.FileNotFoundException;
import java.util.logging.Logger;

import static aarrsolprivatelimited.com.driver.DriverManager.driver;

public class TestVICLogin_PF_DM extends CommonToAllTest {

    @Test
    public void testLoginNegativeVIC() throws FileNotFoundException {
        LoginPage_PF loginPage_PF = new LoginPage_PF(driver);
        loginPage_PF.openVICLoginURL("qa");
        String error_msg = loginPage_PF.loginTOVICInvalidCreds();
        Assert.assertEquals(error_msg, "Your email, password, IP address or location did not match");
        driver.quit();
    }
}


