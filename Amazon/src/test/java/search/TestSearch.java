
package search;

import base.CommonAPI;
import home.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSearch extends CommonAPI{

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
 public void searchItems()throws IOException,InterruptedException{
  SearchPage searchPage=PageFactory.initElements(driver,SearchPage.class);
  searchPage.searchItemsAndSubmitButton();
     searchPage.writeItemsInExcelFile();
 }

}
