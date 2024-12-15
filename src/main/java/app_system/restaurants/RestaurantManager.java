package app_system.restaurants;

import java.util.ArrayList;

public class RestaurantManager {
    private static ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();

    public static void setRestaurants(ArrayList<Restaurant> restaurants) {
        RestaurantManager.restaurants = restaurants;//
    }

    public static ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }


}
