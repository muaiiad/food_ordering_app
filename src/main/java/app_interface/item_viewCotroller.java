package app_interface;

import app_system.restaurants.Menu_Item;
import app_system.restaurants.Restaurant;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class item_viewCotroller {
    @FXML
    ImageView photores;
    @FXML
    Label restaurant_name;
    @FXML
    Label restaurant_info;
    @FXML


  public void setdata(Restaurant res){
      restaurant_name.setText(res.getNameRes());
      restaurant_info.setText(res.getContactInfo());
      //photores.setImage(res.getImgFile());



}
}
