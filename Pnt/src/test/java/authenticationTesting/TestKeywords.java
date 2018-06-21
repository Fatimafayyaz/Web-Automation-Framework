package authenticationTesting;

import base.CommonAPI;
import keywords.Features;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestKeywords extends Features{

    @Test
    public void testKeyWord()throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectFeatures(driver);
    }
}