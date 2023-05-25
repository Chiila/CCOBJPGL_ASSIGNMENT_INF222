package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class drinkController {

   @FXML
   ImageView Barpink, Milktea, Mogu, Shake, Soju;

   @FXML
   Button Barbtn, Shakebtn, Mogubtn, Milkteabtn, Sojubtn;

   Barpink bp = new Barpink();
   Shake sh = new Shake();
   Mogu mg = new Mogu();
   Milktea mt = new Milktea();
   Soju sj = new Soju();

   public void initialize(){
      bp.setName("Barpink");
      bp.setRating("5/10");
      
      sh.setName("Shake");
      sh.setRating("11/10");

      mg.setName("Mogu-Mogu");
      mg.setRating("100/10");
      
      mt.setName("Milktea");
      mt.setRating("9/10");

      sj.setName("Soju");
      sj.setRating("10/10");
   }

   public void showInfo(ActionEvent event){

      Button sourceButton = (Button) event.getSource();
      Alert alert = new Alert (AlertType.INFORMATION);

      if(sourceButton.equals(Barbtn)){
         alert.setContentText("Drink Name: " + bp.getName() + " Drink Rating: " + bp.getRating());
      }
      if(sourceButton == (Shakebtn)){
         alert.setContentText("Drink Name: " + sh.getName() + " Drink Rating: " + sh.getRating());
      }
      if(sourceButton == (Mogubtn)){
         alert.setContentText("Drink Name: " + mg.getName() + " Drink Rating: " + mg.getRating());
      }
      if(sourceButton == (Milkteabtn)){
         alert.setContentText("Drink Name: " + mt.getName() + " Drink Rating: " + mt.getRating());
      }
      if(sourceButton == (Sojubtn)){
         alert.setContentText("Drink Name: " + sj.getName() + " Drink Rating: " + sj.getRating());
      }

      alert.showAndWait();
   }
}