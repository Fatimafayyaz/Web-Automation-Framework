package datadriven;

import utility.DataReader;

import java.io.IOException;

public class ExcelReadLoginCredentials extends DataReader{

    DataReader dr = new DataReader();

    public String[][] getDataFromExcelFile() throws IOException {
        String path ="C:\\Users\\fatim\\Web-Automation-Framework\\Kaiserpermanentee\\testdata\\testfile1.xls";
        String[][] data = dr.fileReader1(path,0);
        return data;
    }


}
