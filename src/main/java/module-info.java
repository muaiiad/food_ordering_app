module com.team.food_ordering_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.fontawesome5;

    opens app_interface to javafx.fxml;
    exports app_interface;
    exports app_system.accounts;
    exports app_system.orders;
    exports app_system.restaurants;
}