package myemployeeproject;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.Serializable;

public class AddEmployee implements Serializable {

    AddEmployee(){
        Stage primaryStage = new Stage();
        VBox layout = new VBox();
        TextField tfName = new TextField();
        TextField tfId = new TextField();
        TextField tfDes = new TextField();
        TextField tfSal = new TextField();
        Button SalariedEmployee= new Button("Add SalariedEmployee");
        Button HourlyEmployee= new Button("Add  HourlyEmployee");
        Button CommissionEmployee= new Button("Add CommissionEmployee");

        SalariedEmployee.setOnAction(new EventHandler<ActionEvent>() {
            @Override

                public void handle(ActionEvent actionEvent) {
                new AddSalariedEmployee();
                }


        });
        HourlyEmployee.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                new AddHourlyEmployee();
            }
        });
        CommissionEmployee.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                new AddCommissionEmployee();
            }
        });
        SalariedEmployee.setMaxSize(160,160);
        HourlyEmployee.setMaxSize(160,160);
        CommissionEmployee.setMaxSize(160,160);
        layout.setPadding(new Insets(40, 0, 0, 130));
        layout.getChildren().addAll(SalariedEmployee,HourlyEmployee,CommissionEmployee);
        Scene secondScene = new Scene(layout, 500, 250);
        Stage newWindow = new Stage();
        newWindow.setTitle("Choice your option");
        newWindow.setScene(secondScene);
        newWindow.setX(primaryStage.getX() + 350);
        newWindow.setY(primaryStage.getY() + 0);

        newWindow.show();
    }
}

