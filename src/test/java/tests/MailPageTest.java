package tests;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MailPage;

public class MailPageTest extends TestBaseSetup {

    public WebDriver driver;
    public LoginPage loginPage;
    public MailPage mailPage;

    @BeforeClass
    public void setUP(){

        driver=getDriver();
    }
    @Test

    public void tabPromotionsTest() {
        loginPage = new LoginPage(driver);
        mailPage = new MailPage(driver);
        loginPage.inputIntoMail();
        mailPage.verifyMailPage();
        mailPage.chooseTabPromotions();
        mailPage.deleteAll();
    }

    @Test

    public void tabSosialTest(){
        loginPage = new LoginPage(driver);
        mailPage = new MailPage(driver);
        loginPage.inputIntoMail();
        mailPage.verifyMailPage();
        mailPage.chooseTabSosial();
        mailPage.deleteAll();
    }

    @AfterClass

    public void tearDown(){
        driver.quit();
    }

}
