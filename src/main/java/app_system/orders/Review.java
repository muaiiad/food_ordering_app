package app_system.orders;
import app_system.accounts.User;
import app_system.restaurants.Restaurant;

import java.util.Scanner;
//abstract class
public class Review {
    private User reviewer;
    private int rate;
    private String text;

    public Review() {
    }

    public Review(User reviewer, int rate, String text) {
        this.reviewer = reviewer;
        this.rate = rate;
        this.text = text;
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

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}