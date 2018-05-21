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
    //String appURL = "http://mail.google.com/";


    @BeforeClass
    public void setUP(){
        //String appURL = "http://mail.google.com/";
        driver=getDriver();
         }

    @Test

    public void PageTest() {
        loginPage = new LoginPage(driver);
        mailPage = new MailPage(driver);
        loginPage.inputIntoMail();
        mailPage.verifyMailPage();
        mailPage.chooseTabPromotions();
        mailPage.deleteAll();

        }

    @AfterClass

    public void tearDown(){
        driver.quit();
    }
}

