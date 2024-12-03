package app_system.orders;

import app_system.accounts.User;
import app_system.restaurants.Menu_Item;

public class Item_review extends Review{
//     user will select the item they will rate it in main
    private Menu_Item reviewed_item;

    public Item_review(User reviewer, int rate,Menu_Item reviewed_item) {
        super(reviewer, rate);
        this.reviewed_item.reviews[reviewed_item.review_count]=rate;
        this.reviewed_item.review_count++;

        if (rate>=4){
            this.reviewed_item.counter_reviews++;
        }
    }

    public Menu_Item getReviewed_item() {
        return reviewed_item;
    }

    public void setReviewed_item(Menu_Item reviewed_item) {
        this.reviewed_item = reviewed_item;
    }
}
