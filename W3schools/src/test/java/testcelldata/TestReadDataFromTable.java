package testcelldata;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import tabledata.ReadDataFromTable;

public class TestReadDataFromTable extends ReadDataFromTable{

    @Test
    public void read(){
       // ApplicationLog.epicLogger();
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ReadDataFromTable readDataFromTable= PageFactory.initElements(driver,ReadDataFromTable.class);
        readDataFromTable.readData();
    }

}
