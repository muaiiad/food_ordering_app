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
    Label nameres;
    @FXML
    Label infores;

  public void setdata(Restaurant res){
      nameres.setText(res.getNameRes());
      infores.setText(res.getContactInfo());
      //photores.setImage(res.getImgFile());
}
}
