package app_interface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class AdminDashboardController {

    @FXML
    private VBox sidebar;
    @FXML
    private Hyperlink homeBtn;
    @FXML
    private Hyperlink restaurantsBtn;
    @FXML
    private Hyperlink menusBtn;
    @FXML
    private Hyperlink ordersBtn;
    @FXML
    private Hyperlink reportsBtn;
    @FXML
    Pane dashPane;

    public void deselectAll() {
        dashPane.getChildren().clear();
        for (Node child: sidebar.getChildren()) {
            child.getStyleClass().removeIf(style -> style.equals("selected"));
            child.getStyleClass().add("unselected");

        }
    }

    public void selectHome(ActionEvent e) {
        deselectAll();
        homeBtn.getStyleClass().removeIf(style -> style.equals("unselected"));
        homeBtn.getStyleClass().add("selected");
    }

    public void selectRestaurants(ActionEvent e) throws IOException {
        deselectAll();
        restaurantsBtn.getStyleClass().removeIf(style -> style.equals("unselected"));
        restaurantsBtn.getStyleClass().add("selected");
        dashPane.getChildren().add(FXMLLoader.load(getClass().getResource("restaurant_dashboard.fxml")));
    }
    public void selectMenus(ActionEvent e) {
        deselectAll();
        menusBtn.getStyleClass().removeIf(style -> style.equals("unselected"));
        menusBtn.getStyleClass().add("selected");
    }

    public void selectOrders(ActionEvent e) {
        deselectAll();
        ordersBtn.getStyleClass().removeIf(style -> style.equals("unselected"));
        ordersBtn.getStyleClass().add("selected");
    }

    public void selectReports(ActionEvent e) {
        deselectAll();
        reportsBtn.getStyleClass().removeIf(style -> style.equals("unselected"));
        reportsBtn.getStyleClass().add("selected");
    }



}
