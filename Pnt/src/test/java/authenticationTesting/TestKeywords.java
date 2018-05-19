package authenticationTesting;

import keywords.Features;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestKeywords extends Features{

    @Test
    public void testKeyWord()throws InterruptedException, IOException {
        selectFeatures(driver);
    }
}