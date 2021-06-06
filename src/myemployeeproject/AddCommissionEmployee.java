
package myemployeeproject;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.Serializable;

public class AddCommissionEmployee implements Serializable {
    AddCommissionEmployee(){
        Stage primaryStage=new Stage();
        TextField tfName = new TextField();
        TextField tfId = new TextField();
        TextField tfDes = new TextField();
        TextField tfCp = new TextField();
        TextField tfTs = new TextField();
        Button Add=new Button("Add");
        Label label1 = new Label("Name");
        Label label2 = new Label("ID:");
        Label label3= new Label("Designation:");
        Label label4= new Label("Commission Percent:");
        Label label5= new Label("Total Sale:");
        Add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                UAP.uc.addNewEmployee(tfName.getText(),tfId.getText(),tfDes.getText(),Integer.parseInt(tfCp.getText()),Integer.parseInt(tfTs.getText()) );

            }
        });

        VBox layout = new VBox();
        tfName.setMaxWidth(150);
        tfId.setMaxWidth(150);
        tfDes.setMaxWidth(150);
        tfCp.setMaxWidth(150);
        tfTs.setMaxWidth(150);
        layout.getChildren().addAll(label1,tfName,label2,tfId,label3,tfDes,label4,tfCp,label5,tfTs,Add);
        Scene secondScene = new Scene(layout, 500, 250);
        Stage newWindow = new Stage();
        newWindow.setTitle("Enter Your Commission Employee Data");
        newWindow.setScene(secondScene);
        newWindow.setX(primaryStage.getX() + 350);
        newWindow.setY(primaryStage.getY() + 0);

        newWindow.show();

    }
}
