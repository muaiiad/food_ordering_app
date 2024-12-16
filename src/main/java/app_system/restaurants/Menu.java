package app_system.restaurants;

import java.io.File;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Menu_Item> items;
    private File imgFile;

    public Menu() {
    }

    public ArrayList<Menu_Item> getItems() {
        return items; //
    }

    public void setItems(ArrayList<Menu_Item> items) {
        this.items = items; //
    }

    public Menu(ArrayList<Menu_Item> items) {
        this.items = items; //
    }



}
