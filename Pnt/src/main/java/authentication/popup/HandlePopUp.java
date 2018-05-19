package authentication.popup;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HandlePopUp extends CommonAPI{
    @FindBy(css = ".modal-body")
    public WebElement scholarshipPopUpWindowWebElement;
    @FindBy(css = ".fa.fa-times-circle-o")
    public WebElement scholarshipPopUpWindowCloseWebElement;

    public WebElement getScholarshipPopUpWindowWebElement() {
        return scholarshipPopUpWindowWebElement;
    }

    public void setScholarshipPopUpWindowWebElement(WebElement scholarshipPopUpWindowWebElement) {
        this.scholarshipPopUpWindowWebElement = scholarshipPopUpWindowWebElement;
    }

    public WebElement getScholarshipPopUpWindowCloseWebElement() {
        return scholarshipPopUpWindowCloseWebElement;
    }

    public void setScholarshipPopUpWindowCloseWebElement(WebElement scholarshipPopUpWindowCloseWebElement) {
        this.scholarshipPopUpWindowCloseWebElement = scholarshipPopUpWindowCloseWebElement;
    }
    public boolean isScholarshipPopUpWindowDisplayed(WebDriver driver1, String locator){

        boolean value = CommonAPI.isPopUpWindowDisplayed(driver1, locator);
        return value;
    }
    public void closePopUpWindow(){

        setScholarshipPopUpWindowCloseWebElement(scholarshipPopUpWindowCloseWebElement);
        getScholarshipPopUpWindowCloseWebElement().click();
    }

    public void handlePopUpWindowBeforeLogIn(WebDriver driver1)throws InterruptedException{
        CommonAPI.sleepFor(2);
        if(isScholarshipPopUpWindowDisplayed(driver1, ".modal-body")) {
            closePopUpWindow();
            CommonAPI.sleepFor(2);
        }
    }

}
