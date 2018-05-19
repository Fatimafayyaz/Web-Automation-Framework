package menu.page;

import base.CommonAPI;

import java.util.List;

public class MenuPage extends CommonAPI {

    public void readMenuText() {
        List<String> menu = getTextFromWebElements(".nav-search-dropdown.searchSelect option");
        for (String st : menu) {
            System.out.println(st);
            }
        System.out.println("Total number of menus in this list are: " + menu.size());
    }
}