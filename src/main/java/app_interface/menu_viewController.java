package app_interface;
import app_system.accounts.Account;
import app_system.accounts.AccountsManager;
import app_system.accounts.Admin;
import app_system.filemanager.FileManager;
import app_system.restaurants.Menu_Item;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import app_system.accounts.User;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;
import java.time.format.ResolverStyle;
import java.util.function.Function;

public class menu_viewController {
    @FXML
    private GridPane grid;
    private int CurrentX;
    private int CurrentY;
//    @FXML
//    private Label nameofres;

    @FXML
    private Label letter,letter2,letter3;
    @FXML
    private Label username,username2,username3;
    @FXML
    private Label Rest,Rest2,Rest3;
    @FXML
    private Label Text,Text2,Text3;
    @FXML
    private FontIcon star11,star12,star13,star14,star15;
    @FXML
    private FontIcon star21,star22,star23,star24,star25;
    @FXML
    private FontIcon star31,star32,star33,star34,star35;


    public void setvalue(String name,String Letter, String rest, String text,int rate){

        letter.setText(Letter);
        username.setText(name);
        Rest.setText(rest);
        Text.setText(text);

        if (rate==1){
            star11.setFill(Color.YELLOW);
        }
        else if (rate==2){
            star11.setFill(Color.YELLOW);
            star12.setFill(Color.YELLOW);
        } else if (rate==3){
            star11.setFill(Color.YELLOW);
            star12.setFill(Color.YELLOW);
            star13.setFill(Color.YELLOW);
        } else if (rate==4){
            star11.setFill(Color.YELLOW);
            star12.setFill(Color.YELLOW);
            star13.setFill(Color.YELLOW);
            star14.setFill(Color.YELLOW);
        } else {
            star11.setFill(Color.YELLOW);
            star12.setFill(Color.YELLOW);
            star13.setFill(Color.YELLOW);
            star14.setFill(Color.YELLOW);
            star15.setFill(Color.YELLOW);
        }


    }
    public void setvalue2(String name,String Letter, String rest, String text,int rate){
        letter2.setText(Letter);
        username2.setText(name);
        Rest2.setText(rest);
        Text2.setText(text);


        if (rate==1){
            star11.setFill(Color.YELLOW);
        }
        else if (rate==2){
            star21.setFill(Color.YELLOW);
            star22.setFill(Color.YELLOW);
        } else if (rate==3){
            star21.setFill(Color.YELLOW);
            star22.setFill(Color.YELLOW);
            star23.setFill(Color.YELLOW);
        } else if (rate==4){
            star21.setFill(Color.YELLOW);
            star22.setFill(Color.YELLOW);
            star23.setFill(Color.YELLOW);
            star24.setFill(Color.YELLOW);
        } else {
            star21.setFill(Color.YELLOW);
            star22.setFill(Color.YELLOW);
            star23.setFill(Color.YELLOW);
            star24.setFill(Color.YELLOW);
            star25.setFill(Color.YELLOW);
        }

    }
    public void setvalue3(String name,String Letter, String rest, String text,int rate){
        letter3.setText(Letter);
        username3.setText(name);
        Rest3.setText(rest);
        Text3.setText(text);


        if (rate==1){
            star31.setFill(Color.YELLOW);
        }
        else if (rate==2){
            star31.setFill(Color.YELLOW);
            star32.setFill(Color.YELLOW);
        } else if (rate==3){
            star31.setFill(Color.YELLOW);
            star32.setFill(Color.YELLOW);
            star33.setFill(Color.YELLOW);
        } else if (rate==4){
            star31.setFill(Color.YELLOW);
            star32.setFill(Color.YELLOW);
            star33.setFill(Color.YELLOW);
            star34.setFill(Color.YELLOW);
        } else {
            star21.setFill(Color.YELLOW);
            star32.setFill(Color.YELLOW);
            star33.setFill(Color.YELLOW);
            star34.setFill(Color.YELLOW);
            star35.setFill(Color.YELLOW);
        }
    }
    @FXML
    public void initialize() throws IOException {
        addTOgrid();
    }

    @FXML
    void addTOgrid() throws IOException {
        for (Menu_Item item : app_system.restaurants.RestaurantManager.getRestaurants().get(0).getMenu().getItems()) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu_item.fxml"));
            VBox MYbox = loader.load();
            Menu_itemController controller = loader.getController();

            if (CurrentX >2) {
                CurrentX = 0;
                CurrentY++;
            }
            controller.setLabel(item.getName(), item.getDescription(), item.getPrice());
            grid.add(MYbox, CurrentX++, CurrentY);
        }

    }
}