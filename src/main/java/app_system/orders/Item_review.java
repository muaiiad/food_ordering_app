package app_system.orders;

import app_system.accounts.User;

public class Item_review extends Review{
//     user will select the item they will rate it in main
    private String reviewed_item;

    public Item_review(User reviewer, int rate,String reviewed_item) {
        super(reviewer, rate);
        this.reviewed_item=reviewed_item;

    }

}
