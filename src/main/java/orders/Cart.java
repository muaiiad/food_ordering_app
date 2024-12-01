package orders;

import java.util.*;
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

    private float Total_price(Cart_Item items)
    {
//        for(Cart_Item itr : items)
//        {
//            totalPrice += items.menu_item.price;
//        }
        return totalPrice;
    }
//   private void  Add_item( Menu_Item menu_item, int quantity )
//
//   {
//        items.add(Cart_Item(Menu_Item,quantity));
//   }

//  private void View_cart()
//
//  {
//
//      System.out.printf("Total Price= %.2f $",totalPrice);
//  }



}
