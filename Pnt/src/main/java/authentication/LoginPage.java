package authentication;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class LoginPage extends CommonAPI{
    @FindBy(css = "#globl-cont a")
    public WebElement loginButtonElement;
    @FindBy(css = ".input_text")
    public WebElement userNameInputField;
    @FindBy(css = ".input_password")
    public WebElement passwordInputField;
    @FindBy(xpath = "//*[@id=\"frmLogin\"]/div/div[3]/p/input")
    public WebElement clickButtonElement;
    public WebElement getClickButtonElement() {
        return clickButtonElement;
    }
    public void setClickButtonElement(WebElement clickButtonElement) {
        this.clickButtonElement = clickButtonElement;
    }
    public WebElement getLoginButtonElement() {
        return loginButtonElement;
   }
    public void setLoginButtonElement(WebElement loginButtonElement) {
        this.loginButtonElement = loginButtonElement;
    }
    public WebElement getUserNameInputField() {
        return userNameInputField;
    }
    public void setUserNameInputField(WebElement userNameInputField) {
        this.userNameInputField = userNameInputField;
    }
    public WebElement getPasswordInputField() {
        return passwordInputField;
    }

    public void setPasswordInputField(WebElement passwordInputField) {
        this.passwordInputField = passwordInputField;
    }
    public void clickOnLoginButton()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLoginButtonElement().click();
    }
    public void typeUserName(){

        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getUserNameInputField().sendKeys("testuser1");
    }
    public void typePassword(){

        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPasswordInputField().sendKeys("abcd1234");
    }
    public void clickOnAuthenticate(){

        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickButtonElement().click();
    }
    public void loginToPntForum(WebDriver driver1) throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnLoginButton();
        CommonAPI.handleNewTab(driver1);
        typeUserName();
        CommonAPI.sleepFor(1);
        typePassword();
        CommonAPI.sleepFor(1);
        clickOnAuthenticate();
        CommonAPI.sleepFor(1);
    }
    public void signIn(WebDriver driver1)throws InterruptedException{
     driver1.findElement(By.cssSelector("#globl-cont a")).click();
     CommonAPI.handleNewTab(driver1);
     driver1.findElement(By.cssSelector(".input_text")).sendKeys("testuser1");
        CommonAPI.sleepFor(1);
     driver1.findElement(By.cssSelector(".input_password")).sendKeys("abcd1234");
        CommonAPI.sleepFor(1);
     driver1.findElement(By.xpath("//*[@id=\"frmLogin\"]/div/div[3]/p/input")).click();
    }
}
