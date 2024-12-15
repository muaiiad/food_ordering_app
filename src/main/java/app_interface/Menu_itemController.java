package app_interface;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;


public class Menu_itemController {

    @FXML
    private Label dishName;
    @FXML
    private Label price;
    @FXML
    private Label disc;
    @FXML
    private Image img;

    public void setLabel ( String name , String dis, float pr)
    {
        dishName.setText(name);
        disc.setText(dis);
        price.setText("$"+pr);
    }
  //  public void setImg ()


}
