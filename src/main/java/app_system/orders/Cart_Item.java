package app_system.orders;

import app_system.restaurants.Menu_Item;

//-------CART ITEM CLASS-------//
public class Cart_Item {
    private Menu_Item menu_item;
    private int quantity;

    public Cart_Item(Menu_Item menu_item, int quantity) {
        this.menu_item = menu_item;
        this.quantity = quantity;
    }

    public Menu_Item getMenu_item() {
        return menu_item;
    }

    public void setMenu_item(Menu_Item menu_item) {
        this.menu_item = menu_item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}