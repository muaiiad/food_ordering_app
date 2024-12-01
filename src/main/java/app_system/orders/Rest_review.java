package app_system.orders;
import app_system.restaurants.*;
import app_system.accounts.User;

public class Rest_review extends Review{
    public Restaurant reviewed;
    public  static int rest_reviews_counter=0;

    public Rest_review(User reviewer, int rate) {
        super(reviewer, rate);
       this.reviewed.rest_reviews[rest_reviews_counter]=rate;


    }

}
