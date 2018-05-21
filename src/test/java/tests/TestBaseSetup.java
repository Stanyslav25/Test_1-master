package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBaseSetup {

    public WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver() {
        driver=initFirefoxDriver();
    }

    public static WebDriver initFirefoxDriver(){

        System.out.println("Launching Firefox browser ....");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://mail.google.com/");
        return driver;
    }

    @BeforeClass
    public void initializeTestBaseSetup(){
        try{
            setDriver();
        }catch (Exception e){
    System.out.println("Error " + e.getStackTrace());
}
    }

}
