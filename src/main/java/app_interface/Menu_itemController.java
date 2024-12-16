package app_interface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;


public class Menu_itemController {
    @FXML
   private Button add_itembutton;
    @FXML
    private Label dishName;
    @FXML
    private Label price;
    @FXML
    private Label disc;
//    @FXML
//    private VBox MYBox;

    public void setLabel ( String name , String dis, float pr)
    {
        dishName.setText(name);
        disc.setText(dis);
        price.setText("$"+pr);
    }



    public void add_item(ActionEvent event ) throws IOException
  {
      FXMLLoader loader =new FXMLLoader(getClass().getResource("DishSelection.fxml"));
       Parent root =loader.load();
      Stage stage =  (Stage) ((Node) event.getSource()).getScene().getWindow();
       Scene scene =new Scene(root);
       stage.setScene(scene);
       stage.show();

  }



}
