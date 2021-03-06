package tests;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.MailPage;

public class SimpleTest extends TestBaseSetup {
    public WebDriver driver;
    public LoginPage loginPage;
    public MailPage mailPage;

    @BeforeClass
    public void setUP(){

        driver=getDriver();
         }

    @Test

    public void PageTest() {
        loginPage = new LoginPage(driver);
        mailPage = new MailPage(driver);
        loginPage.inputIntoMail();
        mailPage.verifyMailPage();
    }

    @AfterClass

    public void tearDown(){
        driver.quit();
    }
}

