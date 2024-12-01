package app_system.restaurants;

import java.util.ArrayList;

public class RestaurantManager {
    private ArrayList<Restaurant> restaurants;

    public RestaurantManager(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
