package app_interface;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class itemchoocecontroller implements Initializable {
    @FXML
    private Stage stage ;
    private Parent root;
    private Scene scene;

    @FXML
    private ListView<String> mylist;
    @FXML
    private Label mylable;


String[]food={"item1","item2","item3","item4","item5","item6","item7","item8","item9","item10"};
   private String currentone;

    public void initialize(URL arg0, ResourceBundle arg1){
        mylist.getItems().addAll(food);
        mylist.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                currentone=mylist.getSelectionModel().getSelectedItem();
                mylable.setText("your dish is : "+currentone);
                System.out.println(currentone);
            }
        });

    }

    public void movetoscene5(ActionEvent e) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("review/item_rate.fxml"));
        stage=(Stage) ((Node)e.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



}

