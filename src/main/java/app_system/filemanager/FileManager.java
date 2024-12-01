package app_system.filemanager;
import app_system.accounts.AccountsManager;
import app_system.accounts.Admin;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;



public class FileManager {

    public static void readIntoAdmins() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            AccountsManager.setAdmins(objectMapper.readValue(new File("./src/main/resources/admins.json"), new TypeReference<ArrayList<Admin>>() {})) ;
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        };
    }

}
