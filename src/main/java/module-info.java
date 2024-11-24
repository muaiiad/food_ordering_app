module com.team.food_ordering_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.team.food_ordering_app to javafx.fxml;
    exports com.team.food_ordering_app;
}