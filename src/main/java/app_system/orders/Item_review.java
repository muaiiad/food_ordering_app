package app_system.orders;

import app_system.accounts.User;
import app_system.restaurants.Menu_Item;

public class Item_review extends Review{
//     user will select the item they will rate it in main
    private Menu_Item reviewed_item;
    public static int review_count = 0;
    public Item_review(User reviewer, int rate,Menu_Item reviewed_item) {
        super(reviewer, rate);
        this.reviewed_item.reviews[review_count]=rate;
        review_count++;
        if (rate>=4){
            this.reviewed_item.counter_reviews++;
        }
    }
}
