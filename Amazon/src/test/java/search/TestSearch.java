
package search;

import home.SearchItem;
import home.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

import java.io.IOException;

public class TestSearch extends SearchPage{

 //@Test
    public void test2() {
    SearchPage searchpage= PageFactory.initElements(driver,SearchPage.class);
    searchpage.searchItems();
    }
 //@Test
  public void search() {
   typeOnInputField("twotabsearchtextbox","laptops");
   clickOnCss(".nav-input");
 }
 @Test
 public void searchItemsList()throws IOException,InterruptedException{
  ApplicationLog.epicLogger();
  TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
  SearchPage searchPage=PageFactory.initElements(driver,SearchPage.class);
  searchPage.searchItemsAndSubmitButton(driver);
     //searchPage.writeItemsInExcelFile();
 }
 //@Test
    public void test(){
     SearchItem searchItem1=new SearchItem();
     searchItem1.searchItem();

 }
}
