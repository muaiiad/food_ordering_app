package app_system.orders;

import java.util.*;

//-------CART CLASS-------//
public class Cart {
    private ArrayList<Cart_Item> items = new ArrayList<Cart_Item>();
    private Date createdDate;
    private float totalPrice=0;

    public Cart() {

    }

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

    public Cart(ArrayList<Cart_Item> items, Date createdDate, float totalPrice) {
        this.items = items;
        this.createdDate = createdDate;
        this.totalPrice = totalPrice;
    }


    private float Total_price( Cart_Item[] items)
    {
        for(Cart_Item itr : this.items)
      {
         totalPrice += itr.getMenu_item().getPrice();
       }
        return totalPrice;
    }
    public void  Add_item( Cart_Item cart_item )

   {
        items.add( cart_item);
   }

    private void View_cart()

  {
      System.out.printf("Total Price= %.2f $",totalPrice);
  }
}
