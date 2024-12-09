package app_interface;

import app_system.restaurants.Restaurant;
import app_system.restaurants.RestaurantManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class RestaurantDashboardFormController {

    @FXML
    private Button addBtn;

    @FXML
    private TextField addressField;

    @FXML
    private Button cancelBtn;

    @FXML
    private Button chooseBtn;

    @FXML
    private TextField contactField;

    @FXML
    private TextField imgField;

    @FXML
    private TextField nameField;

    private File imageFile;
    public VBox resList;
    public Stage parentStage;

    private RestaurantDashboardController parentController;

    public void setParentController(RestaurantDashboardController parentController) {
        this.parentController = parentController;
    }

    public void setImage() {
        FileChooser fc = new FileChooser();
        imageFile = fc.showOpenDialog(parentStage);
        imgField.setText(imageFile.getAbsolutePath());
    }

    public void addRestaurant() throws IOException {
        RestaurantManager.getRestaurants().add(new Restaurant(nameField.getText(), addressField.getText(), contactField.getText(), imageFile ));
        parentController.refreshResList();
        parentStage.close();
    }

}
