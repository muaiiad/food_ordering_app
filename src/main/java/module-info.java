module com.team.food_ordering_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;


    opens app_interface to javafx.fxml;
    exports app_interface;
    exports app_system.accounts;
}