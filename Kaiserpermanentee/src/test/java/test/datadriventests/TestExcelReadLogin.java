package test.datadriventests;

import base.CommonAPI;
import datadriven.ExcelReadLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestExcelReadLogin extends CommonAPI {

    @Test
    public void testExcelRead() throws InterruptedException,IOException {
        ExcelReadLogin excelReadLogin= PageFactory.initElements(driver,ExcelReadLogin.class);
        excelReadLogin.searchCredentials(driver);
    }
}
