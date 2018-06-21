package tabledata;

import base.CommonAPI;
import reporting.TestLogger;

import java.util.List;

public class ReadDataFromTable extends CommonAPI{

public void readData(){
   // String cellData=getTextByCss(".w3-table-all.notranslate tr");//tr:nth-child(3) td:nth-child(4)
    //System.out.println(cellData);
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    List<String> list = getTextFromWebElements(".w3-table-all.notranslate tr");
    for(int i=0; i<list.size(); i++) {
        System.out.println(list.get(i));
    }
       }
}
