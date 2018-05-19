package home;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class ItemsToBeSearched extends CommonAPI {
    DataReader dr = new DataReader();


    public String[] getDataFromExcelFile() throws IOException {
        String path ="C:\\Users\\fatim\\Web-Automation-Framework\\Amazon\\data\\testfile1.xls";
        String[] data = dr.fileReader2(path,0);
        return data;
    }

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException {
        String path = "C:\\Users\\fatim\\Web-Automation-Framework\\Amazon\\data\\testfile1.xls";
        String[] data = dr.fileReader2(path,1);
        return data;
    }
    public void writeDataInExcelFile(String[] value)throws IOException
    {
        dr.writeBack(value);
    }
}
