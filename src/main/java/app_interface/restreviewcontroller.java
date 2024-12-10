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

public class restreviewcontroller {
    @FXML
    private Stage stage ;
    private Parent root;
    private Scene scene;
    public RadioButton rbtn1,rbtn2,rbtn3,rbtn4,rbtn5;



    // to know whitch rest is selected

    public int getres(){
        int rest_index=0;

        if (rbtn1.isSelected()){

            rest_index= 0;
            System.out.println("rest 1 ");
        }
        if (rbtn2.isSelected()){
            rest_index= 1;
            System.out.println("rest 2 ");
        }
        if (rbtn3.isSelected()){
            rest_index= 2;
            System.out.println("rest 3 ");
        }
        if (rbtn4.isSelected()){
            rest_index= 3;
            System.out.println("rest 4 ");
        }
        if (rbtn5.isSelected()){
            rest_index= 4;
            System.out.println("rest 5 ");
        }
        return rest_index;

    }





    public void movetoscene3(ActionEvent e) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("rest-rate.fxml"));
        stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
