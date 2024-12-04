package app_interface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;

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

    public void deselectAll() {
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

    public void selectRestaurants(ActionEvent e) {
        deselectAll();
        restaurantsBtn.getStyleClass().removeIf(style -> style.equals("unselected"));
        restaurantsBtn.getStyleClass().add("selected");
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
