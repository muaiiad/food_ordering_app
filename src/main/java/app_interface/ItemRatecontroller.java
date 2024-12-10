package app_interface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.kordamp.ikonli.javafx.FontIcon;
import java.io.IOException;
public class ItemRatecontroller {
    @FXML
    private FontIcon icon1,icon2,icon3,icon4,icon5;

    @FXML
    private Button btnclose;
    @FXML
    AnchorPane myscene;
    Stage stage;
    private int currentrate;

    public void logout(ActionEvent e) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("logout");
        alert.setContentText("do you want to exit??");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) myscene.getScene().getWindow();
            System.out.println("closed successfuly");
            stage.close();
        }
    }
    public void coloron1(){
        icon1.setFill(Color.TOMATO);
        currentrate=1;
        System.out.println("item rate =>"+currentrate);
    }
    public void coloron2(){
        icon1.setFill(Color.TOMATO);
        icon2.setFill(Color.TOMATO);
        currentrate=2;
        System.out.println("item rate =>"+currentrate);
    }
    public void coloron3(){
        icon1.setFill(Color.TOMATO);
        icon2.setFill(Color.TOMATO);
        icon3.setFill(Color.TOMATO);
        currentrate=3;
        System.out.println("item rate =>"+currentrate);
    }
    public void coloron4(){
        icon1.setFill(Color.TOMATO);
        icon2.setFill(Color.TOMATO);
        icon3.setFill(Color.TOMATO);
        icon4.setFill(Color.TOMATO);
        currentrate=4;
        System.out.println("item rate =>"+currentrate);
    }
    public void coloron5(){
        icon1.setFill(Color.TOMATO);
        icon2.setFill(Color.TOMATO);
        icon3.setFill(Color.TOMATO);
        icon4.setFill(Color.TOMATO);
        icon5.setFill(Color.TOMATO);
        currentrate=5;
        System.out.println( "item rate => "+currentrate);
    }
}

