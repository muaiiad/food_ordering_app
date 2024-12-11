package app_interface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;
import java.util.Objects;


public class reviewcontroller {
    @FXML
    private Stage stage ;
    private Parent root;
    private Scene scene;
    @FXML
    private int currentrate_rest;
    public FontIcon icon1,icon2,icon3,icon4,icon5;

    public void movetoscene2(ActionEvent e) throws IOException {
            Parent root= FXMLLoader.load(getClass().getResource("review/restreview.fxml"));
            stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
            Scene scene=new Scene(root);
            stage.setScene(scene);
             stage.show();
        }
    public void movetoscene4(ActionEvent e) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("review/item_selection.fxml"));
        stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void coloron1(){
        icon1.setFill(Color.TOMATO);
        currentrate_rest=1;
        System.out.println(currentrate_rest);
    }
    public void coloron2(){
        icon1.setFill(Color.TOMATO);
        icon2.setFill(Color.TOMATO);
        currentrate_rest=2;
        System.out.println(currentrate_rest);
    }
    public void coloron3(){
        icon1.setFill(Color.TOMATO);
        icon2.setFill(Color.TOMATO);
        icon3.setFill(Color.TOMATO);
        currentrate_rest=3;
        System.out.println(currentrate_rest);
    }
    public void coloron4(){
        icon1.setFill(Color.TOMATO);
        icon2.setFill(Color.TOMATO);
        icon3.setFill(Color.TOMATO);
        icon4.setFill(Color.TOMATO);
        currentrate_rest=4;
        System.out.println(currentrate_rest);
    }
    public void coloron5(){
        icon1.setFill(Color.TOMATO);
        icon2.setFill(Color.TOMATO);
        icon3.setFill(Color.TOMATO);
        icon4.setFill(Color.TOMATO);
        icon5.setFill(Color.TOMATO);
        currentrate_rest=5;
        System.out.println(currentrate_rest);
    }

}
