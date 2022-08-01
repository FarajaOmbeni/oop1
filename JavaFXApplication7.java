/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author omben
 */
public class JavaFXApplication7 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label num1_lbl = new Label("Enter first number: ");
        Label num2_lbl = new Label("Enter second number: ");
        Label sum_lbl = new Label("Sum: ");
        TextField num1_txt = new TextField();
        TextField num2_txt = new TextField();
        TextField sum_txt = new TextField("*****");
        Button add = new Button("SUM");
        Button h1 = new Button("ACCURATE");
        Button h2 = new Button("BALL");
        Button h3 = new Button("POST");
        Button h4 = new Button("OFFSIDE");
        ChoiceBox role = new ChoiceBox();
        role.getItems().addAll("ombeni","faraja","trevor");
        
        GridPane mygrid = new GridPane();
        mygrid.setMinSize(400,600);
        mygrid.setVgap(10);
        mygrid.setHgap(10);
        mygrid.setAlignment(Pos.CENTER);
        
        mygrid.add(num1_lbl, 1,1);
        mygrid.add(num2_lbl, 1, 2);
        mygrid.add(sum_lbl, 1,3);
        mygrid.add(add, 1,4);
        mygrid.add(num1_txt, 2,1);
        mygrid.add(num2_txt, 2,2);
        mygrid.add(sum_txt, 2,3);
        HBox mybox = new HBox();
        mybox.setSpacing(10);
        mybox.getChildren().addAll(h1,h2,h3,h4);
      //  mygrid.add(mybox, 1,5);
        mygrid.add(role,1,6);
      
      add.setOnMouseClicked((new EventHandler<MouseEvent>() {
         @Override
         public void handle(MouseEvent event) {
             String number1 = num1_txt.getText(); //getting the number from the num_1 textfield
             String number2 = num2_txt.getText(); //getting the number from the num_2 textfield
             
             int num1=Integer.parseInt(number1); //transorming the string to an int
             int num2=Integer.parseInt(number2); //transforming the string to an int
             
             int sum = num1+num2; //adding the numbers
             String result = String.valueOf(sum); //transforming the sum to string
           
             
             sum_txt.setText(result); //displaying the sum to the sum_txt textfield
             
             
             
            
             
             //CONNECTION TO THE DB
             String username = num1_txt.getText();
             String password = num2_txt.getText();
             
             
             try
             {
                 //register driver
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 //get connection 
                 Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/evercise","root","kipese@!!!");
                 //create statement
                 Statement st = con.createStatement();
                 //execcute query
                 String query = "INSERT INTO exercice.userdetails VALUES(username, password)VALUES('"+username+"','"+password+"') ";
                 //inserting
                 st.executeUpdate(query);
                 //selecting
                 ResultSet rs = st.executeQuery(query);
                 if(rs.next()){
                     Alert al = new Alert(Alert.AlertType.CONFIRMATION);
                     al.setContentText("Login Succesful!");
                     al.show();
                 }
                 else {
                     Alert al = new Alert(Alert.AlertType.WARNING);
                     al.setContentText("Invalid Credentials!");
                     al.show();
                 }
                 
                 //close connection
                 con.close();
                 
                 
             
             }
            catch(Exception ee){System.out.println(ee);System.out.println("Connection error");}
            {
               
            }
         
        
             
         }
        
        
        
        
        
        
        
        
        
         }));
        
        
        Scene myscene = new Scene(mygrid);
        
        Stage mystage = new Stage();
        mystage.setScene(myscene);
        mystage.setTitle("ADD NUMBERS");
        mystage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
