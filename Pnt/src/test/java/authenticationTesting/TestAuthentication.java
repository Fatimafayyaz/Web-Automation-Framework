package authenticationTesting;

import authentication.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAuthentication extends LoginPage{

    @Test
    public void logIn() throws InterruptedException{
        LoginPage loginPage= PageFactory.initElements(driver,LoginPage.class);
        loginPage.loginToPntForum(driver);
    }

}
