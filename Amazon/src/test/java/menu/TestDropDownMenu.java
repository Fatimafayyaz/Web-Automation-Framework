package menu;

import menu.page.MenuPage;
import org.testng.annotations.Test;

public class TestDropDownMenu extends MenuPage {

    @Test
    public void menu()
    {
        readMenuText();
    }

}
