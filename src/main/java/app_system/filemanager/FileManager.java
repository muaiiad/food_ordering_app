package app_system.filemanager;
import app_system.accounts.AccountsManager;
import app_system.accounts.Admin;
import app_system.restaurants.Restaurant;
import app_system.restaurants.RestaurantManager;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;



public class FileManager {

    public static void readFiles() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            AccountsManager.setAdmins(objectMapper.readValue(new File("src/main/resources/admins.json"), new TypeReference<ArrayList<Admin>>() {}));
            RestaurantManager.setRestaurants(objectMapper.readValue(new File("src/main/resources/restaurants.json"), new TypeReference<ArrayList<Restaurant>>() {}));
        } catch (IOException e) {
            e.printStackTrace();
        };
    }

}
