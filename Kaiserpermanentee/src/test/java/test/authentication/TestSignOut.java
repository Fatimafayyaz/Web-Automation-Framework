package test.authentication;

import authentication.SignInPage;
import authentication.SignoutPage;
import authentication.popup.HandlePopup;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestSignOut extends CommonAPI {

    @Test
    public void signOut()throws InterruptedException{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        signInPage.signInToKaiser(driver);
        HandlePopup handlePopUp = PageFactory.initElements(driver, HandlePopup.class);
        handlePopUp.closePopUpWindow(driver);
        SignoutPage signoutPage=PageFactory.initElements(driver, SignoutPage.class);
        signoutPage.signoutToKaiser(driver);

         }
}
