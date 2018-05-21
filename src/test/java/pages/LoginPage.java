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
        buttonNext.click();
        return new LoginPage(driver);
    }

    public MailPage typePassword(){
        waitForClickable(passwordField);
        clearAndSendKey(passwordField, "");
        passwordButtonNext.click();
        return new MailPage(driver);
    }

    public void inputIntoMail(){
        typeLogin();
        typePassword();
    }

}


