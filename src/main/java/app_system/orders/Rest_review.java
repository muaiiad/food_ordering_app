package app_system.orders;
import app_system.restaurants.*;
import app_system.accounts.User;

public class Rest_review extends Review{
    private Restaurant Reviewed;

    public Rest_review(User reviewer, int rate,Restaurant reviewed) {
        super(reviewer, rate);

       reviewed.rest_reviews[reviewed.review_index]=rate;
    }


    public Restaurant getReviewed() {
        return Reviewed;
    }

    public void setReviewed(Restaurant reviewed) {
        this.Reviewed = reviewed;
    }
}
