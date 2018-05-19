package keywords;

import authentication.LoginPage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import searchpage.SearchPage;

import java.io.IOException;

public class Features extends CommonAPI {
//    LoginPage logInPage = new LoginPage();
//    SearchPage searchPage = new SearchPage();
//    HandlePopUp handlePopUp = new HandlePopUp();


    public void signIn(WebDriver driver1)throws InterruptedException{
        LoginPage loginPage= PageFactory.initElements(driver1,LoginPage.class);
        loginPage.loginToPntForum(driver1);

    }
    public void search(WebDriver driver1) throws InterruptedException{
        SearchPage searchPage=PageFactory.initElements(driver1,SearchPage.class);
        searchPage.searchTopics(driver1);
    }
    public void registration(){
        typeByCss("", "email");
        typeByCss("", "password");
    }



    public void select(String featureName, WebDriver driver1)throws IOException, InterruptedException{
        switch(featureName){
            case "popup":
               // handlePopUp.handlePopUpWindowBeforeLogIn(driver1);
                break;
            case "signIn":
                signIn(driver1);
                break;//
            case "search":
                search(driver1);
                 //searchPage.searchTopicsKeywords(driver1);
                break;
            default:
                System.out.println("you entered invalid choice");
               // throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException{
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=0; i<testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}
