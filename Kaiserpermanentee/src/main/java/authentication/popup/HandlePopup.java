package authentication.popup;

import authentication.SignInPage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HandlePopup extends SignInPage{

        @FindBy(css= ".modal-body.trapstart")
        public  WebElement whatsNewPopUpWindowWebElement;
        @FindBy( css = "#GotIt")
        public  WebElement closeButtonWebElement;

        public WebElement getWhatsNewPopUpWindowWebElement() {
            return whatsNewPopUpWindowWebElement;
        }

        public void setWhatsNewPopUpWindowWebElement(WebElement whatsNewPopUpWindowWebElement) {
            this.whatsNewPopUpWindowWebElement = whatsNewPopUpWindowWebElement;
        }
        public WebElement getCloseButtonWebElement() {
            return closeButtonWebElement;
        }

        public void setCloseButtonWebElement(WebElement closeButtonWebElement) {
            this.closeButtonWebElement = closeButtonWebElement;
        }
        public void clickOnCloseButton()
        {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getCloseButtonWebElement().click();
        }
        public boolean iswhatsNewPopUpWindowDisplayed(WebDriver driver, String locator){
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            boolean value = CommonAPI.isPopUpWindowDisplayed(driver, locator);
            return value;
        }
        public void closePopUpWindow(WebDriver driver)throws InterruptedException{
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            //TestLogger.log("pop window displayed, now close this popup");
           if(iswhatsNewPopUpWindowDisplayed(driver,".modal-body.trapstart")) {
                 clickOnCloseButton();
                 TestLogger.log("pop up closed");


            }
        }
        public void closePopup(WebDriver driver1){
          driver1.findElement(By.cssSelector(".modal-body.trapstart"));
          driver1.findElement(By.cssSelector("#GotIt")).click();
        }


    }



