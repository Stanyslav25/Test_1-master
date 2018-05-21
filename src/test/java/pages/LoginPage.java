package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageMethods {

    private WebDriver driver;
    private PageMethods pageMethods;

    @FindBy(xpath = "//input[@id ='identifierId']")
    private WebElement loginField;

    @FindBy(xpath="//div[@id='identifierNext']")
    private WebElement buttonNext;

    @FindBy(xpath = "//input[@class='whsOnd zHQkBf' and  @name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//div[@id = 'passwordNext']")
    private WebElement passwordButtonNext;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage typeLogin(){
        if(loginField.isDisplayed())

        clearAndSendKey(loginField, "");
        System.out.println("Login....");
        buttonNext.click();
        return new LoginPage(driver);
    }

    public void typePassword(){
        waitForClickable(passwordField);
        System.out.println("Password....");
        clearAndSendKey(passwordField, "");
        passwordButtonNext.click();

    }

    public MailPage inputIntoMail(){
        typeLogin();
        typePassword();
        System.out.println("Going to mail page....");
        return new MailPage(driver);

    }

}


