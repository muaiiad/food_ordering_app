package orders;

import java.util.*;
import app_system.restaurants.Menu_Item;
//-------CART CLASS-------//
public class Cart {
    private ArrayList<Cart_Item> items;
     private Date createdDate;
    private float totalPrice=0;

    public ArrayList<Cart_Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Cart_Item> items) {
        this.items = items;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    private Cart(ArrayList<Cart_Item> items, Date createdDate, float totalPrice) {
        this.items = items;
        this.createdDate = createdDate;
        this.totalPrice = totalPrice;
    }


    private float Total_price( Cart_Item[] items)
    {
        for(Cart_Item itr : this.items)
      {
         totalPrice += itr.menu_item.getPrice();
       }
        return totalPrice;
    }
   private void  Add_item( Cart_Item cart_item )

   {
        items.add( cart_item);
   }

  private void View_cart()

  {

      System.out.printf("Total Price= %.2f $",totalPrice);
  }



}
