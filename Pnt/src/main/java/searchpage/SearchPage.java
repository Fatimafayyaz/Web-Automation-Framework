package searchpage;

import authentication.LoginPage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends LoginPage{
    @FindBy(xpath ="//*[@id=\"button_search\"]" )
    public WebElement clickOnSearchTabWebElement;
    @FindBy(css = ".input_text")
    public WebElement searchInputFieldWebElement;
    @FindBy (css = ".button_submit")
    public WebElement clickOnSearchButtonWebElement;
        public WebElement getClickOnSearchTabWebElement() {
        return clickOnSearchTabWebElement;
    }
    public void setClickOnSearchTabWebElement(WebElement clickOnSearchTabWebElement) {
        this.clickOnSearchTabWebElement = clickOnSearchTabWebElement;
    }
    public WebElement getSearchInputFieldWebElement() {
        return searchInputFieldWebElement;
    }
    public void setSearchInputFieldWebElement(WebElement searchInputFieldWebElement) {
        this.searchInputFieldWebElement = searchInputFieldWebElement;
    }

    public WebElement getClickOnSearchButtonWebElement() {
        return clickOnSearchButtonWebElement;
    }

    public void setClickOnSearchButtonWebElement(WebElement clickOnSearchButtonWebElement) {
        this.clickOnSearchButtonWebElement = clickOnSearchButtonWebElement;
    }
     public void clickOnSearchMenu(){
        getClickOnSearchTabWebElement().click();
    }
    public void typeOnSearchInputField(){
        getSearchInputFieldWebElement().sendKeys("Selenium");
    }
    public void clickOnSearchButton(){
        getClickOnSearchButtonWebElement().click();
    }
    public void searchTopics(WebDriver driver1)throws InterruptedException{
     //   CommonAPI.sleepFor(1);
        clickOnSearchMenu();
        CommonAPI.sleepFor(1);
        typeOnSearchInputField();
        CommonAPI.sleepFor(2);
        clickOnSearchButton();
        CommonAPI.sleepFor(1);
    }
    public void searchTopicsKeywords(WebDriver driver1)
    {
        driver1.findElement(By.xpath("//*[@id=\"button_search\"]")).click();
        driver1.findElement(By.cssSelector(".input_text")).sendKeys("Selenium");
        driver1.findElement(By.cssSelector(".button_submit")).click();

        }

}

