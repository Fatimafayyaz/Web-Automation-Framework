package datadriven;

import authentication.SignoutPage;
import authentication.popup.HandlePopup;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class ExcelReadLogin extends CommonAPI {
    HandlePopup handlePopup=new HandlePopup();
    SignoutPage signoutPage=new SignoutPage();
    @FindBy(css="#userid")
    public static WebElement userNameInputField;
    @FindBy(css="#password")
    public static WebElement passwordInputField;
    @FindBy(id="Submit")
    public static WebElement clickButtonElement;
    @FindBy(xpath = "//*[@id=\"kp-header-login-link\"]")
    public static WebElement signinaccess;
    @FindBy(css="#submitButton")
    public static WebElement signon;
    public void searchForUser(String userName){
        userNameInputField.sendKeys(userName);
    }
    public void searchForPassword(String passWord){
        passwordInputField.sendKeys(passWord);
    }
    public void readCredentials(String userName,String passWord)throws InterruptedException{
        userNameInputField.sendKeys(userName);
        sleepFor(2);
        passwordInputField.sendKeys(passWord);
        sleepFor(2);
    }
   public void  submitButton(){
       clickButtonElement.click();
   }
   public void searchCredentials(WebDriver driver1)throws InterruptedException,IOException{
        ExcelReadLoginCredentials excelReadLoginCredentials=new ExcelReadLoginCredentials();
        String[][] data=excelReadLoginCredentials.getDataFromExcelFile();
        for(int i=0;i<data.length;i++){
                for(int j=0;j<1;j++) {
                    if(i==0){
                    readCredentials(data[i][j],data[i][j+1]);
                    submitButton();
                    sleepFor(1);
                handlePopup.closePopup(driver1);
                System.out.println(driver1.getCurrentUrl());
                signoutPage.signoutToKaiser(driver1);
                sleepFor(1);
                signinaccess.click();}
                else
                    {
                        readCredentials(data[i][j],data[i][j+1]);
                        signon.click();
                        sleepFor(2);
                        handlePopup.closePopup(driver1);
                        sleepFor(2);
                        signoutPage.signoutToKaiser(driver1);
                        sleepFor(2);
                        signinaccess.click();   }
                    }
            }
            }

   }


