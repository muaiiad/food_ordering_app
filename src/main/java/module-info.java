module com.team.food_ordering_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires de.jensd.fx.glyphs.fontawesome;


    opens app_interface to javafx.fxml;
    exports app_interface;
    exports app_system.accounts;
    exports app_system.orders;
}