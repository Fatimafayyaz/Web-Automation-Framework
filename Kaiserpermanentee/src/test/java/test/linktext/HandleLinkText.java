package test.linktext;

import base.CommonAPI;
import linktext.LinkTextPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HandleLinkText extends CommonAPI {

    @Test
    public void linkText()throws InterruptedException {
        LinkTextPage linkTextPage= PageFactory.initElements(driver, LinkTextPage.class);
        linkTextPage.clickLinkByHref(driver);
    }
}
