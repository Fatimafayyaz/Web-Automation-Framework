package purchase;

import base.CommonAPI;
import home.ItemsPurchased;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestPurchase extends CommonAPI{
    @Test
    public void itemsPurchased() throws InterruptedException {
        ItemsPurchased itemsPurchased= PageFactory.initElements(driver, ItemsPurchased.class);
        itemsPurchased.itemsPurchased();
    }
}
