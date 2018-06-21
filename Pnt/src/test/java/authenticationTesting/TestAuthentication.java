package authenticationTesting;

import authentication.LoginPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestAuthentication extends LoginPage{

    @Test
    public void logIn() throws InterruptedException{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LoginPage loginPage= PageFactory.initElements(driver,LoginPage.class);
        loginPage.loginToPntForum(driver);
    }

}
