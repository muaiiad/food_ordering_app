package app_interface;

import app_system.accounts.AccountsManager;
import app_system.restaurants.Menu_Item;
import app_system.restaurants.RestaurantManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class MenuDashboardFormController {

    @FXML
    private Button addBtn;

    @FXML
    private Button cancelBtn;

    @FXML
    private Button chooseBtn;

    @FXML
    private TextField descriptionField;

    @FXML
    private TextField imgField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField priceField;


    private RestaurantDashboardController parentController;
    private Stage parentStage;

    public void setParentController(RestaurantDashboardController parentController) {
        this.parentController = parentController;
    }

    public void setParentStage(Stage parentStage) {
        this.parentStage = parentStage;
    }

    @FXML
    public void setImage() {
        FileChooser fc = new FileChooser();
        File imageFile = fc.showOpenDialog(parentStage);
        imgField.setText(imageFile.getAbsolutePath());
    }




    @FXML
    void addItem(ActionEvent event) throws IOException {
        RestaurantManager.getRestaurants().get(parentController.getSelectedRestaurantIndex()).getMenu().getItems().add(
                new Menu_Item(nameField.getText(),descriptionField.getText(),Float.valueOf(priceField.getText()),""));
        parentController.refreshMenuList();
        parentStage.close();
    }

    @FXML
    void cancel() {
        parentStage.close();
    }



}
