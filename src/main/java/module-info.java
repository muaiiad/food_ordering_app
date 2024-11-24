module com.team.food_ordering_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens app_interface to javafx.fxml;
    exports app_interface;
}