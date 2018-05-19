package authenticationTesting;

import authentication.popup.HandlePopUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestPopUpWindow extends HandlePopUp {
    @Test
    public void testPopUp()throws InterruptedException{
        HandlePopUp handlePopUp = PageFactory.initElements(driver, HandlePopUp.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver);
    }
}
