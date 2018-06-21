package test.authentication;

import authentication.SignInPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestAuthentication extends CommonAPI {

    @Test
    public void signIn() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        signInPage.signInToKaiser(driver);
       // Assert.assertEquals(driver.findElement(By.id("_firstName")).getText(),"fatima");

    }


}