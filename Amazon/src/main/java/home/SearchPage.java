package home;

import base.CommonAPI;
import database.ConnectDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchPage extends CommonAPI{
    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public static WebElement searchInputWebElement;
    @FindBy(how = How.CSS, using =".nav-input")
    public static WebElement submitButtonWebElement;
    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }
    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }
    public void searchFor(String value){
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton(){
        getSubmitButtonWebElement().click();
    }
    public void clearInput(){
        getSearchInputWebElement().clear();
    }

    public void searchItemsAndSubmitButton()throws IOException,InterruptedException {
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] value = itemsToBeSearched.getDataFromExcelFile();
        for(int i=0; i<value.length; i++) {
            searchFor(value[i]);
            sleepFor(1);
            submitSearchButton();
           sleepFor(1);
            //waitUntilClickAble(By.cssSelector(".nav-input"));
            clearInput();
        }
    }
    public void writeItemsInExcelFile() throws IOException{
        ItemsToBeSearched itemsToBeSearched =new ItemsToBeSearched();
      String[] value=itemsToBeSearched.getDataFromExcelFile();
         //for(int i=0;i<value.length;i++){
            itemsToBeSearched.writeDataInExcelFile(value);
        }

    @FindBy(id= "twotabsearchtextbox")
    public WebElement SearchInputField;
    public WebElement getSearchInputField() {
        return SearchInputField;
    }
    public void setSearchInputField(WebElement searchInputField) {
        SearchInputField = searchInputField;
    }
    public void searchItems()
    {
        List<String> itemList=getItemsValue();
        for(String st:itemList)
        {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
            //waitUntilVisible(driver.findElement(By.id("twotabsearchtextbox")));

        }
    }
    public static List<String> getItemsValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Java Book");
        itemsList.add("Selenium Book");
        itemsList.add("Laptop");
        itemsList.add("Honey");
        itemsList.add("Toothpaste");
        itemsList.add("ear-ring");
        itemsList.add("ps4games");
        itemsList.add("macAir");

        return itemsList;
    }
    public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDB();
        connectDB.insertDataFromArrayListToMySql(getItemsValue(),"aftabShoppingList","items");
    }

}
