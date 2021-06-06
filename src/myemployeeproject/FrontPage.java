package myemployeeproject;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;

public class FrontPage implements Serializable {

    FrontPage(){
        Stage primaryStage=new Stage();
        TextField tfEmail=new TextField();
        TextField tfPas=new TextField();
        Label label = new Label("Enter Your Mail");
        Label label1 = new Label("Enter Your Password");
        Button sign_in=new Button("sign in");

        sign_in.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage primaryStage=new Stage();
                Button AddEmp;
                Button SEmployeeSalary;
                Button IncreaseSal;
                Button SEmployeeDis;
                Button AllEmployeeDis;
                Button Exit;
                AddEmp = new Button("Add Employee");
                SEmployeeSalary = new Button("Specific Employee Salary");
                IncreaseSal = new Button("Increase Salary");
                SEmployeeDis = new Button("Specific Employee Information");
                AllEmployeeDis = new Button("All Employee Information");
                Exit = new Button("Exit");
                AddEmp.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        new AddEmployee();
                    }
                });
                SEmployeeSalary.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        new SpecificEmployeeSalary();
                    }
                });
                IncreaseSal.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        new AddIncreaseSalary();
                    }
                });
                SEmployeeDis.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        new AddSpecificEmployeeDis();

                    }
                });
                AllEmployeeDis.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        UAP.uc.display();
                    }
                });
                Exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        UAP.saveData(UAP.uc);
                        System.exit(0);
                    }
                });




                //VBox layout = new VBox();
                VBox layout = new VBox();
                AddEmp.setMaxSize(160,160);
                SEmployeeSalary.setMaxSize(160,160);
                IncreaseSal.setMaxSize(160,160);
                SEmployeeDis.setMaxSize(160,160);
                AllEmployeeDis.setMaxSize(160,160);
                Exit.setMaxSize(160,160);
                layout.setPadding(new Insets(40, 0, 0, 130));

                layout.getChildren().addAll(AddEmp,SEmployeeSalary,IncreaseSal,SEmployeeDis,AllEmployeeDis,Exit);
                Scene secondScene = new Scene(layout, 500, 250);
                Stage newWindow = new Stage();
                newWindow.setTitle("Enter Requires Data");
                newWindow.setScene(secondScene);
                newWindow.setX(primaryStage.getX() + 350);
                newWindow.setY(primaryStage.getY() + 0);

                newWindow.show();



            }
        });
        VBox layout = new VBox();
        tfEmail.setMaxWidth(160);
        tfPas.setMaxWidth(160);
        tfEmail.setAlignment(Pos.CENTER);
        tfPas.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(label,tfEmail,label1,tfPas,sign_in);
        Scene secondScene = new Scene(layout, 500, 250);
        Stage newWindow = new Stage();
        newWindow.setTitle("Welcome To Employee Project");
        newWindow.setScene(secondScene);
        newWindow.setX(primaryStage.getX()+350);
        newWindow.setY(primaryStage.getY() +0);

        newWindow.show();
    }

}


