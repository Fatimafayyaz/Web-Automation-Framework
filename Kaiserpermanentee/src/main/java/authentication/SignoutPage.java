package authentication;

import authentication.popup.HandlePopup;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reporting.TestLogger;

public class SignoutPage extends HandlePopup{

    public void signoutToKaiser(WebDriver driver) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TestLogger.log("click on preferences");
        driver.findElement(By.cssSelector("#select-dropdown-account-selector-topnav")).click();
        TestLogger.log("click on signout");
        driver.findElement(By.cssSelector("#sign_out_link-topnav")).click();
    }
}
