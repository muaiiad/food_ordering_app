package app_system.orders;
import app_system.restaurants.*;
import app_system.accounts.User;

public class Rest_review extends Review{
    private Restaurant reviewed;
    private static int rest_reviews_counter=0;

    public Rest_review(User reviewer, int rate) {
        super(reviewer, rate);
        //add the logic here, i made rest_reviews an arraylist
    }


    public static int getRest_reviews_counter() {
        return rest_reviews_counter;
    }

    public static void setRest_reviews_counter(int rest_reviews_counter) {
        Rest_review.rest_reviews_counter = rest_reviews_counter;
    }

    public Restaurant getReviewed() {
        return reviewed;
    }

    public void setReviewed(Restaurant reviewed) {
        this.reviewed = reviewed;
    }
}
