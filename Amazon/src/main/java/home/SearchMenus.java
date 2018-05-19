package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchMenus extends CommonAPI{
    @FindBy(id = "searchDropdownBox")
    public WebElement dropDownMenu;
    @FindBy(id="twotabsearchtextbox")
    public WebElement enterSelectedOption;
    public WebElement getEnterSelectedOption() {
        return enterSelectedOption;
    }
    public void setEnterSelectedOption(WebElement enterSelectedOption) {
        this.enterSelectedOption = enterSelectedOption;
    }
    public WebElement getDropDownMenu() {
        return dropDownMenu;
    }
    public void setDropDownMenu(WebElement dropDownMenu) {
        this.dropDownMenu = dropDownMenu;
    }
     public void clickOnMenuItem()throws InterruptedException
    {
        getDropDownMenu().click();
        //Thread.sleep(2000);
       // waitUntilVisible(By.id("searchDropdownBox"));
        selectOptionByVisibleText(dropDownMenu,"Apps & Games");
         enterSelectedOption.sendKeys(Keys.ENTER);
         Thread.sleep(1000);


      //  takeEnterKeys("#searchDropdownBox > option:nth-child(5)");
        //getSelectMenuOption().click();
        //Thread.sleep(2000);
        //driver.navigate().back();
    }

    /*public void clickOnMenuItem(WebDriver driver) throws InterruptedException
    {

        Select objselect =new Select(driver.findElement(By.cssSelector(".nav-search-dropdown.searchSelect")));
        Thread.sleep(2000);
        objselect.selectByVisibleText("Amazon Devices");
        Thread.sleep(2000);
        WebElement selectedValue=objselect.getFirstSelectedOption();
        System.out.println("Selected value: "+selectedValue.getText());
        selectedValue.click();
        Thread.sleep(3000);
    }*/

}
