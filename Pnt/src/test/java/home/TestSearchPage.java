package home;

import authentication.LoginPage;
import authentication.popup.HandlePopUp;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import searchpage.SearchPage;

public class TestSearchPage extends CommonAPI {

    @Test
    public void searchNewTopic() throws InterruptedException{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HandlePopUp handlePopUp = PageFactory.initElements(driver, HandlePopUp.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver);
        LoginPage loginPage= PageFactory.initElements(driver,LoginPage.class);
        loginPage.loginToPntForum(driver);
        SearchPage searchPage= PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchTopics(driver);
    }



}
