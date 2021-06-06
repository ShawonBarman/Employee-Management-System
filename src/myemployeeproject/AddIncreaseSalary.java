package myemployeeproject;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.Serializable;

public class AddIncreaseSalary implements Serializable {

    AddIncreaseSalary() {
        Stage primaryStage = new Stage();
        TextField tfId = new TextField();
        TextField tfAmount = new TextField();
        Label label = new Label("ID");
        Label label1 = new Label("Enter Increase Amount");
        Button Add = new Button("Add");
        Add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    UAP.uc.increaseSalary(tfId.getText(), Integer.parseInt(tfAmount.getText()));
                } catch (InvalidSalaryException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        });

        VBox layout = new VBox();
        tfId.setMaxWidth(150);
        tfAmount.setMaxWidth(150);
        layout.getChildren().addAll(label, tfId, label1, tfAmount, Add);
        Scene secondScene = new Scene(layout, 500, 250);
        Stage newWindow = new Stage();
        newWindow.setTitle("Enter Requires Data");
        newWindow.setScene(secondScene);
        newWindow.setX(primaryStage.getX() + 350);
        newWindow.setY(primaryStage.getY() + 0);

        newWindow.show();
    }
}
