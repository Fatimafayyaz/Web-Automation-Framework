package authentication;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SignInPage {
    @FindBy(css="#userid")
    public WebElement userNameInputField;
    @FindBy(css="#password")
    public WebElement passwordInputField;
    @FindBy(id="Submit")
    public WebElement clickButtonElement;
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
    public WebElement getClickButtonElement() {
        return clickButtonElement;
    }
    public void setClickButtonElement(WebElement clickButtonElement) {
        this.clickButtonElement = clickButtonElement;
    }
   public void clickOnSignInButton()
   {
       TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getClickButtonElement().click();
   }
   public void typeUserName()
   {
       TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getUserNameInputField().sendKeys("uesr1");
   }
   public void typePasseword()
   {
       TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getPasswordInputField().sendKeys("abcd");
   }
   public void clickOnAuthenticate()
   {
       TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getClickButtonElement().click();
   }
   public void signInToKaiser(WebDriver driver) {
       TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       typeUserName();
       typePasseword();
       clickOnSignInButton();
       }

}
