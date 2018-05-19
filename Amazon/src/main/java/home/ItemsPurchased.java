package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ItemsPurchased extends CommonAPI {
    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public WebElement searchInputWebElement;
    @FindBy(how = How.CSS, using =".nav-input")
    public WebElement submitButtonWebElement;
    @FindBy(linkText= "Vinmatto")
    public WebElement WomenTopSelected;
    @FindBy( linkText = "Women's Short Sleeve V Neck Flowy Tunic Top")
    public WebElement ImageTopSelected;
    @FindBy(css=".a-dropdown-prompt")
    public WebElement selectTopSize;
    public WebElement getImageTopSelected() {
        return ImageTopSelected;
    }
   public WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }
    public WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }
    public WebElement getWomenTopSelected() {
        return WomenTopSelected;
    }
    public void searchWomenTop(){getSearchInputWebElement().sendKeys("Women Tops", Keys.ENTER);}
    public void selectWomenTop()
    {
        getWomenTopSelected().click();
    }
    public void itemsPurchased()throws InterruptedException{
        searchWomenTop();
        sleepFor(1);
        selectWomenTop();
        sleepFor(1);
        getImageTopSelected().click();
        selectTopSize.click();

    }








}

