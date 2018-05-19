package search;

import base.CommonAPI;
import home.SearchMenus;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearchMenus extends CommonAPI {

    @Test
    public void testSearchMenuItem()throws InterruptedException
    {
        SearchMenus searchMenus= PageFactory.initElements(driver,SearchMenus.class);
        searchMenus.clickOnMenuItem();
    }
}
