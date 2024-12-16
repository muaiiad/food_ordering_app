package app_system.restaurants;

import app_system.orders.Review;

import java.util.ArrayList;

public class Menu_Item {
    private String name;
    private String description;
    private float price;
    private String options;
    private float rating;
    private ArrayList<Review> reviews;

    public Menu_Item() {
    }


    public Menu_Item(String name, String description, float price, String options) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.options = options;
    }
    public String getName() {
        return name;//
    }

    public void setName(String name) {
        this.name = name;//
    }

    public String getDescription() {
        return description;//
    }

    public void setDescription(String description) {
        this.description = description;//
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
