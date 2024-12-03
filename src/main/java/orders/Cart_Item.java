package orders;

import app_system.restaurants.Menu_Item;

//-------CART ITEM CLASS-------//
public class Cart_Item {
   public Menu_Item menu_item;
  public int quantity;

   public Cart_Item(Menu_Item menu_item, int quantity) {
       this.menu_item = menu_item;
     this.quantity = quantity;
   }
}