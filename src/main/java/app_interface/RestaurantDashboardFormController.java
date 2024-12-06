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

    public void refreshResList() throws IOException {
        resList.getChildren().clear();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("restaurant_dashboard_item.fxml"));

        AnchorPane item = loader.load();
        RestaurantDashboardItemController itemController = loader.getController();


        for (Restaurant res: RestaurantManager.getRestaurants()) {
            itemController.setData(res);
            resList.getChildren().add(item);
        }
    }

    public void setImage() {
        FileChooser fc = new FileChooser();
        imageFile = fc.showOpenDialog(parentStage);
        imgField.setText(imageFile.getAbsolutePath());
    }

    public void addRestaurant() throws IOException {
        RestaurantManager.getRestaurants().add(new Restaurant(nameField.getText(), addressField.getText(), contactField.getText(), imageFile ));
        refreshResList();
        parentStage.close();
    }

}
