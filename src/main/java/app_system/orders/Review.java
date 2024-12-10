package app_system.orders;
import app_system.accounts.User;
import app_system.restaurants.Restaurant;

import java.util.Scanner;
//abstract class
public  abstract class Review {
   protected User reviewer;
   protected int rate;

    public Review( User reviewer, int rate) {
        this.reviewer = reviewer;
        this.rate = rate;
    }


//    public abstract void setrate( rests, int index, int item_rate);

    public User getReviewer() {
        return reviewer;
    }
    public void setReviewer(User reviewer) {
        this.reviewer = reviewer;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
